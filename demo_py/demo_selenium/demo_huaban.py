from time import sleep
from selenium import webdriver
import json


def zhihu_login():
    brower = webdriver.Chrome()
    brower.get('https://www.zhihu.com/signup')
    sigup_switch_btn = brower.find_element_by_xpath('//*[@id="root"]/div/main/div/div/div/div[2]/div[2]/span')
    if sigup_switch_btn.text == "登录":
        sigup_switch_btn.click()

        uname_textfield = brower.find_element_by_xpath(
            '//*[@id="root"]/div/main/div/div/div/div[2]/div[1]/form/div[1]/div[2]/div[1]/input')
        unpwd_textfield = brower.find_element_by_xpath(
            '//*[@id="root"]/div/main/div/div/div/div[2]/div[1]/form/div[2]/div/div[1]/input')
        sigup_btn = brower.find_element_by_xpath('//*[@id="root"]/div/main/div/div/div/div[2]/div[1]/form/button')

        j = cfg_read()
        uname_textfield.send_keys(j["name"])
        unpwd_textfield.send_keys(j["pwd"])
        sigup_btn.click()

    sleep(10)
    brower.close()


def cfg_write():
    d = {
        "name": "abcdef",
        "pwd": "123456"
    }

    with open("./zhihu.json", 'a') as f:
        json.dump(d, f, indent=4)
        print("写入成功！")


def cfg_read():
    with open("./zhihu.json", 'r') as f:
        j = json.load(f)
    return j


if __name__ == '__main__':
    zhihu_login()


