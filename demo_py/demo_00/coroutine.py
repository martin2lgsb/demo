def consumer():
    r = ''
    while True:
        n = yield r
        if not n:
            return
        print('[CONSUMER] - %s' % n)
        r = '200 OK'


def produce(c):
    c.send(None)
    n = 0
    while n < 5:
        n += 1
        print('[PRODUCER] - %s' % n)
        r = c.send(n)
        print('[PRODUCER] CONSUMER return - %s' % r)
    c.close()


if __name__ == '__main__':
    c = consumer()
    produce(c)