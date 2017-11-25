import pandas as pd

data = pd.read_table('./bnc15knum.txt', names=['Word', 'Frequency'])
data['Score'] = 0
df = pd.DataFrame(data)

df.to_csv('./BNC15k.csv', index=None, header=None)
