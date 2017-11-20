import requests
import itchat
import time
import random

KEY = '21dd41367ffe45aeab4b9c8186f88725'
UserID = '0'
Hour = 0

def get_response(msg):
    apiUrl = 'http://www.tuling123.com/openapi/api'
    data = {
        'key': KEY,
        'info': msg,
        'userid': UserID,
    }

    try:
        r = requests.post(apiUrl, data=data).json()
        return r.get('text')
    except:
        return

def change_userid():
    global Hour
    global UserID
    now = time.localtime(time.time()).tm_hour
    if (abs(Hour - now)) > 1 :
        Hour = now
        UserID = random.randint(1000, 9999)

@itchat.msg_register(itchat.content.TEXT)
def tuling_reply(msg):
    change_userid()
    defaultReplay = '机器人正在调试...'
    reply = get_response(msg['Text'])

    return reply or defaultReplay


itchat.auto_login(enableCmdQR=2, hotReload=True)
itchat.run()
