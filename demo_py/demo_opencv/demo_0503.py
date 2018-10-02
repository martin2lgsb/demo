import cv2
from distutils.sysconfig import get_python_lib


def detect():
    cascade_path1 = get_python_lib() + '/cv2/data/haarcascade_frontalface_default.xml'
    cascade_path2 = get_python_lib() + '/cv2/data/haarcascade_eye.xml'
    face_cascade = cv2.CascadeClassifier(cascade_path1)
    eye_cascade = cv2.CascadeClassifier(cascade_path2)
    camera = cv2.VideoCapture(0)

    while True:
        ret, frame = camera.read()
        # todo cv2.error
        gray = cv2.cvtColor(frame, cv2.COLOR_BGR2GRAY)
        faces = face_cascade.detectMultiScale(gray, 1.3, 5)
        for x, y, w, h in faces:
            img = cv2.rectangle(
                frame,
                (x, y),
                (x+w, y+h),
                (255, 0, 0),
                2
            )
            roi_gray = gray[y:y+h, x:x+w]
            eyes = eye_cascade.detectMultiScale(roi_gray, 1.03, 5, 0, (40, 40))
            for ex, ey, ew, eh in eyes:
                cv2.rectangle(
                    img,
                    (ex, ey),
                    (ex+ew, ey+eh),
                    (0, 255, 0),
                    2
                )
                cv2.imshow("camera", frame)
                if cv2.waitKey(1000 / 12) & 0xff == ord("q"):
                    break
        camera.release()
        cv2.destroyAllWindows()


if __name__ == '__main__':
    detect()