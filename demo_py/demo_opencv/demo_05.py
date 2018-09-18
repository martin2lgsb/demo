import cv2
import numpy as np
from matplotlib import pyplot as plt

img = np.zeros((512, 512, 3), np.uint8)
cv2.line(
    img,
    (0, 0),
    (511, 511),
    (0, 255, 0),
    5
)
# plt.imshow(img, "gray")
# plt.show()

gray = cv2.cvtColor(img, cv2.COLOR_BGR2GRAY)
edges = cv2.Canny(gray, 50, 120)
minLineLength = 20
maxLineGap = 5
lines = cv2.HoughLinesP(edges, 1, np.pi/180, 100, minLineLength, maxLineGap)

for x1, y1, x2, y2 in lines[0]:
    cv2.line(img, (x1, y1), (x2, y2), (0, 100, 0), 2)

cv2.imshow("edges", edges)
cv2.imshow("lines", img)
cv2.waitKey(0)
cv2.destroyAllWindows()