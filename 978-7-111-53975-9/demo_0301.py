import cv2
import numpy as np
from scipy import ndimage

def hpf():
    kernel_3x3 = np.array([
        [-1, -1, -1],
        [-1, 8, -1],
        [-1, -1, -1]
    ])

    kernel_5x5 = np.array([
        [-1, -1, -1, -1, -1],
        [-1, 1, 2, 1, -1],
        [-1, 2, 4, 2, -1],
        [-1, 1, 2, 1, -1],
        [-1, -1, -1, -1, -1]
    ])

    img = cv2.imread("/Users/m2lgsb/Downloads/dog.jpg", 0)
    k3 = ndimage.convolve(img, kernel_3x3)
    k5 = ndimage.convolve(img, kernel_5x5)

    blurred = cv2.GaussianBlur(img, (11, 11), 0)
    g_hpf = img - blurred
    cv2.imshow("3x3", k3)
    cv2.imshow("5x5", k5)
    cv2.imshow("g_hpf", g_hpf)
    cv2.waitKey()
    cv2.destroyAllWindows()


def canny():
    img = cv2.imread("/Users/m2lgsb/Downloads/dog.jpg", 0)
    cv2.imwrite("canny.jpg", cv2.Canny(img, 200, 300))
    cv2.imshow("canny", cv2.imread("canny.jpg"))
    cv2.waitKey()
    cv2.destroyAllWindows()


def outline_green():
    img = np.zeros((200, 200), dtype=np.uint8)
    img[50:150, 50:150] = 255
    ret, thresh = cv2.threshold(img, 127, 255, 0)
    image, contours, hierarchy = cv2.findContours(
        thresh,
        cv2.RETR_TREE,
        cv2.CHAIN_APPROX_SIMPLE
    )
    color = cv2.cvtColor(img, cv2.COLOR_GRAY2BGR)
    img = cv2.drawContours(color, contours, -1, (0, 255, 0), 2)
    cv2.imshow("contours", img)
    cv2.waitKey()
    cv2.destroyAllWindows()


if __name__ == '__main__':
    # hpf()
    # canny()
    outline_green()
