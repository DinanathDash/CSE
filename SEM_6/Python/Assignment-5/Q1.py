'''
🔹 Single Layer Perceptron (SLP)
--------------------------------

✅ Definition:
A Single Layer Perceptron is the most basic form of a neural network. It consists of:
- An input layer
- An output layer with no hidden layers

✅ Architecture:
Input Layer       Output
 (x1)   ─┐
 (x2)   ─┼──► (weighted sum + activation) ► ŷ
 (x3)   ─┘

Each input is multiplied by a weight, summed with a bias, and passed through an activation function (usually step or sigmoid for binary classification).

✅ Loss Function:
For binary classification:
    𝓛_binary = -[y * log(ŷ) + (1 - y) * log(1 - ŷ)]

Where:
- y is the true label (0 or 1)
- ŷ is the predicted probability

--------------------------------------------------

🔹 Multilayer Perceptron (MLP)
------------------------------

✅ Definition:
A Multilayer Perceptron is a feedforward neural network with one or more hidden layers between input and output. It can model non-linear relationships.

✅ Architecture:
Input Layer     Hidden Layer(s)        Output Layer
 (x1)   ─┐         (h1)   ─┐
 (x2)   ─┼─► W1 ─► (h2)   ─┼─► W2 ─► (ŷ)
 (x3)   ─┘         (h3)   ─┘

- Activation functions in hidden layers: ReLU, tanh, etc.
- Output layer activation: softmax (multi-class) or sigmoid (binary)

✅ Loss Function:
For multi-class classification using softmax:
    𝓛_categorical = -∑[i=1 to C] y_i * log(ŷ_i)

Where:
- C = number of classes
- y_i = 1 if true class is i, else 0
- ŷ_i = predicted probability for class i

--------------------------------------------------

🧠 Summary Table:

| Aspect         | SLP                        | MLP                            |
|----------------|----------------------------|--------------------------------|
| Layers         | 1 (no hidden layers)       | ≥2 (at least one hidden layer) |
| Function       | Linear classifier          | Non-linear modeling            |
| Suitable for   | Linearly separable data    | Complex problems (e.g., images)|
| Activation     | Step / Sigmoid             | ReLU / Tanh / Sigmoid / Softmax |
'''