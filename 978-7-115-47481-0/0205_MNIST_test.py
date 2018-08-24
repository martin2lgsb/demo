import numpy as np
import matplotlib.pyplot as plt
import math

if __name__ == '__main__':
    data_file = open("/Users/m2lgsb/Code/Datasets/Kaggle/MNIST/train.csv", 'r')
    data_list = data_file.readlines()
    data_file.close()

    all_values = data_list[1].split(",")
    cols = int(math.sqrt(len(all_values[1:])))
    # image_array = np.asfarray(all_values[1:]).reshape((cols, cols))
    # plt.imshow(image_array, cmap='Greys', interpolation=None)
    # plt.show()

    scaled_input = (np.asfarray(all_values[1:]) / 255.0 * 0.99) + 0.01
    print(scaled_input)
