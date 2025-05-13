'''
Architecture Overview
Input layer: 784 neurons (28×28 flattened pixels)
Hidden layer: 128 neurons, ReLU activation
Output layer: 10 neurons, Softmax activation (one for each digit class)
'''




import tensorflow as tf
from tensorflow.keras.models import Sequential
from tensorflow.keras.layers import Dense, Flatten
from tensorflow.keras.utils import to_categorical
# Load MNIST data
(X_train, y_train), (X_test, y_test) = tf.keras.datasets.mnist.load_data()
# Normalize pixel values
X_train = X_train / 255.0
X_test = X_test / 255.0
# One-hot encode labels
y_train = to_categorical(y_train, num_classes=10)
y_test = to_categorical(y_test, num_classes=10)
# Build ANN model
model = Sequential()
model.add(Flatten(input_shape=(28, 28)))         # Flatten 28x28 to 784
model.add(Dense(128, activation='relu'))         # Hidden layer
model.add(Dense(10, activation='softmax'))       # Output layer
# Compile model
model.compile(optimizer='adam', loss='categorical_crossentropy', metrics=['accuracy'])
# Train model
model.fit(X_train, y_train, epochs=10, batch_size=32, verbose=1)
# Evaluate model
loss, accuracy = model.evaluate(X_test, y_test)
print(f'Test Accuracy: {accuracy:.4f}')