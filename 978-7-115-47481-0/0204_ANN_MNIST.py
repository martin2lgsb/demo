# neural network class definition
import numpy
import scipy.special
import matplotlib.pyplot as plt


class neuralNetwork:

    # initialise the neural network
    def __init__(self, inputnodes, hiddennodes, outputnodes, learningrate):
        self.inodes = inputnodes
        self.hnodes = hiddennodes
        self.onodes = outputnodes
        self.lr = learningrate

        self.wih = numpy.random.normal(0.0, pow(self.hnodes, -0.5), (self.hnodes, self.inodes))
        self.who = numpy.random.normal(0.0, pow(self.onodes, -0.5), (self.onodes, self.hnodes))

        self.activation_function = lambda x: scipy.special.expit(x)

    # train the neural network
    def train(self, inputs_list, targets_list):
        inputs = numpy.array(inputs_list, ndmin=2).T
        targets = numpy.array(targets_list, ndmin=2).T

        hidden_inputs = numpy.dot(self.wih, inputs)
        hidden_outputs = self.activation_function(hidden_inputs)

        final_inputs = numpy.dot(self.who, hidden_outputs)
        final_outputs = self.activation_function(final_inputs)

        targets = numpy.array(targets_list, ndmin=2).T
        output_errors = targets - final_outputs
        hidden_errors = numpy.dot(self.who.T, output_errors)

        self.who += self.lr * numpy.dot((output_errors * final_outputs * (1.0 - final_outputs)), numpy.transpose(hidden_outputs))
        self.wih += self.lr * numpy.dot((hidden_errors * hidden_outputs * (1.0 - hidden_outputs)), numpy.transpose(inputs))

    # query the neural network
    def query(self, inputs_list):
        inputs = numpy.array(inputs_list, ndmin=2).T

        hidden_inputs = numpy.dot(self.wih, inputs)
        hidden_outputs = self.activation_function(hidden_inputs)

        final_inputs = numpy.dot(self.who, hidden_outputs)
        final_outputs = self.activation_function(final_inputs)

        return final_outputs


if __name__ == '__main__':
    input_nodes = 784
    hidden_nodes = 100
    output_nodes = 10
    learning_rate = 0.3

    n = neuralNetwork(input_nodes, hidden_nodes, output_nodes, learning_rate)
    # print(n.query([1.0, 0.5, -1.5]))

    # MNIST
    training_data_file = open("/Users/m2lgsb/Code/Datasets/Kaggle/MNIST/train.csv", 'r')
    training_data_list = training_data_file.readlines()
    training_data_file.close()

    count = 0
    for record in training_data_list[1:]:
        if count > 500:
            break
        train_values = record.split(",")
        inputs = (numpy.asfarray(train_values[1:]) / 255.0 * 0.99) + 0.01
        targets = numpy.zeros(output_nodes) + 0.01
        targets[int(train_values[0])] = 0.99
        n.train(inputs, targets)
        count += 1

    # test_data_file = open("/Users/m2lgsb/Code/Datasets/Kaggle/MNIST/test.csv", 'r')
    # test_data_list = test_data_file.readlines()
    # test_data_file.close()

    test_values = training_data_list[120].split(",")
    print(test_values)
    image_array = numpy.asfarray(test_values[1:]).reshape((28, 28))
    plt.imshow(image_array, cmap='Greys', interpolation=None)
    plt.show()

    res = n.query((numpy.asfarray(test_values[1:]) / 255.0 * 0.99) + 0.01)
    print(res)


