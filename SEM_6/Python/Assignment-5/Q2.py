'''
Definition: Feedforward ANN for Iris Classification
A simple feedforward Artificial Neural Network (ANN) for the Iris dataset has:

Input layer: 4 neurons (sepal length, sepal width, petal length, petal width)
Hidden layer(s): e.g., 1 layer with 8 neurons using ReLU activation
Output layer: 3 neurons (for 3 classes: Setosa, Versicolor, Virginica) with Softmax activation
'''


import numpy as np
from sklearn.datasets import load_iris
from sklearn.model_selection import train_test_split
from sklearn.preprocessing import StandardScaler, OneHotEncoder
from tensorflow.keras.models import Sequential
from tensorflow.keras.layers import Dense
from tensorflow.keras.utils import to_categorical
# Load and prepare the Iris dataset
iris = load_iris()
X = iris.data
y = iris.target.reshape(-1, 1)
# One-hot encode labels
encoder = OneHotEncoder(sparse_output=False)
y_encoded = encoder.fit_transform(y)
# Normalize input features
scaler = StandardScaler()
X_scaled = scaler.fit_transform(X)
# Split the dataset
X_train, X_test, y_train, y_test = train_test_split(X_scaled, y_encoded, test_size=0.2, random_state=42)
# Build a simple feedforward ANN
model = Sequential()
model.add(Dense(8, input_dim=4, activation='relu'))  # Hidden layer
model.add(Dense(3, activation='softmax'))            # Output layer
# Compile the model
model.compile(optimizer='adam', loss='categorical_crossentropy', metrics=['accuracy'])
# Train the model
model.fit(X_train, y_train, epochs=100, batch_size=5, verbose=0)
# Evaluate the model
loss, accuracy = model.evaluate(X_test, y_test)
print(f'Test Accuracy: {accuracy:.4f}')