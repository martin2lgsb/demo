import cv2
from distutils.sysconfig import get_python_lib


def detect():
    filename = "/Users/m2lgsb/Downloads/lqd.jpeg"
    cascade_path = get_python_lib() + '/cv2/data/haarcascade_frontalface_default.xml'
    face_cascade = cv2.CascadeClassifier(cascade_path)

    img = cv2.imread(filename)
    gray = cv2.cvtColor(img, cv2.COLOR_BGR2GRAY)
    faces = face_cascade.detectMultiScale(gray, 1.3, 5)
    for (x, y, w, h) in faces:
        img = cv2.rectangle(
            img,
            (x, y),
            (x + w, y + h),
            (255, 0, 0),
            2
        )
    cv2.namedWindow("Vikings")
    cv2.imshow("Vikings", img)
    cv2.waitKey()
    cv2.destroyAllWindows()


if __name__ == '__main__':
    # print(get_python_lib())
    detect()
