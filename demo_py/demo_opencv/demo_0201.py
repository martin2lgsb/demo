import cv2, numpy, os

def image_show():
    image = cv2.imread("/Users/m2lgsb/Downloads/v2-6976e5810ac87119a51fbbcffd9a1540_hd.jpg")
    cv2.namedWindow("show")
    cv2.imshow("show", image)
    cv2.waitKey(0)
    cv2.destroyAllWindows()

def image_random():
    randomByteArray = bytearray(os.urandom(120000))
    flatNumpyArray = numpy.array(randomByteArray)

    grayImage = flatNumpyArray.reshape(300, 400)
    cv2.imwrite('randomGray.png', grayImage)

    bgrImage = flatNumpyArray.reshape(100, 400, 3)
    cv2.imwrite('randomColor.png', bgrImage)

def video_capture():
    cameraCapture = cv2.VideoCapture(0)
    fps = 30
    size = (int(cameraCapture.get(cv2.CAP_PROP_FRAME_WIDTH)),
            int(cameraCapture.get(cv2.CAP_PROP_FRAME_HEIGHT)))
    videoWriter = cv2.VideoWriter(
        'MyOutputVid.avi',
        cv2.VideoWriter_fourcc('I', '4', '2', '0'),
        fps,
        size
    )
    sucess, frame = cameraCapture.read()
    numFrameRemaining = 10 * fps - 1
    while sucess and numFrameRemaining > 0:
        videoWriter.write(frame)
        sucess, frame = cameraCapture.read()
        numFrameRemaining -= 1
    cameraCapture.release()

def video_show():
    clicked = False
    def onMouse(event, x, y, flags, param):
        global clicked
        if event == cv2.EVENT_LBUTTONUP:
            clicked = True

    cameraCapture = cv2.VideoCapture(0)
    cv2.namedWindow('MyWindow')
    cv2.setMouseCallback('MyWindow', onMouse)

    print('showing camera feed. click window or press any key to stop.')

    success, frame = cameraCapture.read()
    while success and cv2.waitKey(1) == -1 and not clicked:
        cv2.imshow('MyWindow', frame)
        success, frame = cameraCapture.read()

    cv2.destroyWindow('MyWindow')
    cameraCapture.release()


if __name__ == '__main__':
    # image()
    # image_random()
    # video_capture()
    video_show()
