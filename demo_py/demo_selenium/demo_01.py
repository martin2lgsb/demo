from selenium import webdriver
# from selenium.webdriver import ActionChains

browser = webdriver.Chrome()

url = 'https://www.zhihu.com/explore'
browser.get(url)
# browser.execute_script('window.scrollTo(0, document.body.scrollHeight)')
# browser.execute_script('alert("To Bottom")')

logo = browser.find_element_by_id('zh-top-link-logo')
print(logo)

# input = browser.find_element_by_class_name('zu-top-add-question')
# print(input.text)


browser.close()
