# Higher-Order function
from functools import reduce


def add(x, y, f):
    return f(x) + f(y)


def f_map(x):
    return x * x


def fn(x, y):
    return x * 10 + y

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