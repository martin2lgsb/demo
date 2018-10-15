import asyncio
import threading

@asyncio.coroutine
def hello():
    print("fxck you - (%s)" % threading.currentThread())
    yield from asyncio.sleep(1)
    print("fxck again - (%s)" % threading.currentThread())


async def fxck():
    print("aaa - (%s)" % threading.currentThread())
    await asyncio.sleep(2)
    print("bbb - (%s)" % threading.currentThread())


if __name__ == '__main__':
    loop = asyncio.get_event_loop()
    tasks = [fxck(), fxck()]
    loop.run_until_complete(asyncio.wait(tasks))
    loop.close()
