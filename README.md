# Liver-Patient-Classification---MLP
Soft Computing Project
1. Data collection module:

Dataset is ILPD( Indian Liver Patient Dataset ) taken from the UCI Machine Learning Repository. Number of instances are 583. It is multivariate dataset containing 10 variables i.e. age, gender, total Bilirubin, direct Bilirubin, total proteins, albumin, A/G ratio, SGPT, SGOT and Alkphos. This dataset contains 72% liver disease patient records and 28% contains Non-Liver disease patient records.

2. Pre Processing Module:

In this project we use ANN algorithm like Multi Layer Perceptron (MLP) using back propagation is applied and either binary or bi polar weights are taken in random. Feedback is sent back to the input layer by layer (through hidden layers) for changing or adjusting the weights

3. Classification and Normalization:

The data from the dataset is classified and normalized in order to make the input data into the data range that the sigmoid activation function lie in [0,1] and tanh[-1,1]

4. Train the data:

In this module we classify the records and errors from the classification are fed back into the network and modify the network accordingly. 
In order to train the data
Initially input values and associated weights are set.
A function that sums up the weights and maps the result to a output.
Neurons are organized into required layer.
In training phase the correct class for each record is known and the output nodes are assigned s “1” for the diseased patients and “0” non liver diseased patients. The errors are detected in this module and are sent back to the network for adjustments.

5. Performance evaluation:

We compare the performance of MLP with limited weights with a MLP with normal weights using the accuracy as evaluation parameter. According to the references it is found that accuracy is high for multi layer perceptron with minimum hidden layers.

Intially we have implemented the code with java language and for the better results we used WEKA tool application.
