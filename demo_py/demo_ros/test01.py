import numpy as np
import matplotlib.pyplot as plt

def reason(a):
    pass

def test():
    test_list = [1,2,3,4,5][0:2]
    print(test_list)

    a = True
    if not a:
        print(111)
    else:
        print(222)
    # print(filter(lambda s: 3 < s < 8, test_list))
    # test_res = np.mean(filter(lambda s: 3 < s < 8, test_list))
    # print(test_res)

    x = np.arange(1, 11)

    y = 2 * x + 5

    plt.title('Laser Scanner Data')
    plt.xlabel('Time (s)')
    plt.ylabel('Distance (m)')
    plt.plot([x for x in range(0, 10)], [1, 2, 1, 2, 1, 2, 1, 2, 1, 2])
    plt.show()






if __name__ == '__main__':
    test()