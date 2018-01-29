import pymysql
import pandas as pd

config = {
          'host':'127.0.0.1',
          'port':3306,
          'user':'root',
          'password':'',
          'db':'bnc15k',
          'charset':'utf8',
          'cursorclass':pymysql.cursors.DictCursor,
          }

db = pymysql.connect(**config)
cursor = db.cursor()

def create_table():
    cursor.execute('DROP TABLE IF EXISTS m2lgsb')
    sql = """CREATE TABLE m2lgsb
    (
    id int NOT NULL AUTO_INCREMENT,
    word varchar(255),
    frequency int,
    score tinyint DEFAULT 0,
    ko date,
    PRIMARY KEY (id)
    )"""
    cursor.execute(sql)

def words_import():
    data = pd.read_csv('./BNC15k.csv', names=['word', 'frequency'])
    dex = data.index
    c = 0
    try:
        sql = 'INSERT INTO m2lgsb (word, frequency) values (%s, %s)'
        for i in dex:
            cursor.execute(sql, (str(data['word'][i]), int(data['frequency'][i])));
            c += 1
            print(c)
        db.commit()
    finally:
        db.close()


if __name__ == '__main__':
    create_table()
    words_import()
