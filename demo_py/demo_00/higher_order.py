# Higher-Order function
from functools import reduce, partial


def add(x, y, f):
    return f(x) + f(y)


def f_map(x):
    return x * x


def fn(x, y):
    return x * 10 + y


def lazy_sum(*args):
    def sum():
        ax = 0
        for n in args:
            ax = ax + n
        return ax
    return sum


def log(func):
    def wrapper(*args, **kw):
        print("call %s():" % func.__name__)
        return func(*args, **kw)
    return wrapper


def log_text(text):
    def decorator(func):
        def wrapper(*args, **kw):
            print('%s %s():' % (text, func.__name__))
            func(*args, **kw)
            print("asdf")
        return wrapper
    return decorator


@log_text("fxck")
def now():
    print('now, now, now!')


if __name__ == '__main__':
    # 变量可以指向函数
    print(abs)
    x = abs(-10)
    print(x)

    f = abs
    print(f(-10))

    # 函数名也是变量 - 保留关键字(reserved word)

    # 传入函数
    print(add(-2, -5, abs))

    # map
    r = map(f_map, range(0, 10))
    print(list(r))

    print([x * x for x in range(0, 10)])

    print(list(map(str, range(0, 10))))

    # reduce
    print(reduce(fn, [1, 3, 5, 7, 9]))

    # str2int
    print(reduce(lambda x0, y0: x0 * 10 + y0, map(int, '13579')))

    # filter
    print(list(filter(lambda n: n % 2 == 1, [1, 2, 4, 5, 6, 9, 10, 15])))

    # sorted
    print(sorted([36, 5, -12, 9, -21], key=abs))

    # 返回函数
    f = lazy_sum(1, 3, 5, 7, 9)
    print(f)
    print(f())

    now()

    # 偏函数
    int2 = partial(int, base=2)
    print(int2('1010101'))
