import os
from apikey import openai_api_key, google_api_key, google_cse_id

import streamlit as st
from langchain.llms import OpenAI
from langchain.prompts import PromptTemplate
from langchain.chains import LLMChain, SequentialChain
from langchain.memory import ConversationBufferMemory
from langchain.utilities import GoogleSearchAPIWrapper

os.environ['OPENAI_API_KEY'] = openai_api_key
os.environ['GOOGLE_API_KEY'] = google_api_key
os.environ['GOOGLE_CSE_ID'] = google_cse_id


# Web
st.title('LongChain Demo')
prompt = st.text_input('prompt')

# Templates
title_template = PromptTemplate(
    input_variables=['topic'],
    template='write me a fake news title about {topic}'
)

report_template = PromptTemplate(
    input_variables=['title', 'google_result'],
    template='''
    write me a fake news report based on this title: {title} 
    while leveraging this google search result: {google_result}
    '''
)

# Memory
title_memory = ConversationBufferMemory(input_key='topic', memory_key='chat_history')
report_memory = ConversationBufferMemory(input_key='title', memory_key='chat_history')


# LLM
llm = OpenAI(temperature=0.8)
title_chain = LLMChain(llm=llm, prompt=title_template, verbose=True, output_key='title', memory=title_memory)
report_chain = LLMChain(llm=llm, prompt=report_template, verbose=True, output_key='report', memory=report_memory)
google = GoogleSearchAPIWrapper()

if prompt:
    title = title_chain.run(prompt)
    google_result = google.run(prompt)
    report = report_chain.run(title=title, google_result=google_result)

    st.write(title)
    st.write(report)

    with st.expander("Title History"):
        st.info(title_memory.buffer)
    with st.expander("Report History"):
        st.info(report_memory.buffer)
    with st.expander("Goolge Result"):
        st.info(google_result)

