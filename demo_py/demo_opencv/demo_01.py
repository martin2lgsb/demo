import cv2
import numpy as np

img = np.zeros((3, 3), dtype=np.uint8)
print(img)
print(img.shape)

cv2.namedWindow("image")
cv2.imshow("image", img)
cv2.waitKey(0)