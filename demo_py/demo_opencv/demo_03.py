import cv2
import numpy as np

img = cv2.imread("/Users/m2lgsb/Downloads/flower.jpg")
# img[0, 0] = [255, 255, 255]

# cv2.imshow("flower", img)
# cv2.waitKey(0)

# print(img.item(150, 120, 0))
# img.itemset((150, 120, 0), 255)
# print(img.item(150, 120, 0))

# img[:, :, 1] = 0
# cv2.imshow("flower", img)
# cv2.waitKey(0)

piece = img[0:100, 0:100]
img[100:200, 100:200] = piece

cv2.imshow("flower", img)
cv2.waitKey(0)