import cv2
import numpy as np
from matplotlib import pyplot as plt

# img = np.zeros((512, 512, 3), np.uint8)
# cv2.circle(img, (100, 100), 50, (55, 255, 155), 5)
# plt.imshow(img, 'brg')
# plt.show()

planets = cv2.imread("/Users/m2lgsb/Downloads/planet.jpeg")
gray_img = cv2.cvtColor(planets, cv2.COLOR_BGR2GRAY)
img = cv2.medianBlur(gray_img, 5)
cimg = cv2.cvtColor(img, cv2.COLOR_GRAY2BGR)
circles = cv2.HoughCircles(img, cv2.HOUGH_GRADIENT, 1, 120, param1=100, param2=30, minRadius=0, maxRadius=0)
circles = np.uint16(np.around(circles))

for i in circles[0, :]:
    cv2.circle(
        planets,
        (i[0], i[1]),
        i[2],
        (0, 255, 0),
        2
    )

    cv2.circle(
        planets,
        (i[0], i[1]),
        2,
        (0, 0, 255),
        3
    )

cv2.imshow("circles", planets)
cv2.waitKey(0)
cv2.destroyAllWindows()