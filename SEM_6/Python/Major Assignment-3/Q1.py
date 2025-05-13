# Task 1: Data Preprocessing
import tensorflow as tf
from sklearn.model_selection import train_test_split
import numpy as np
# Load dataset
(train_images, train_labels), (test_images, test_labels) = tf.keras.datasets.fashion_mnist.load_data()
# Normalize
train_images = train_images / 255.0
test_images = test_images / 255.0
# Flatten
X_train = train_images.reshape(-1, 784)
X_test = test_images.reshape(-1, 784)
# Check for NaNs
assert not np.isnan(X_train).any() and not np.isnan(X_test).any()
# Labels are already in numeric form (0-9)
y_train, y_test = train_labels, test_labels



# Task 2: K-Nearest Neighbors (KNN) Classification
from sklearn.neighbors import KNeighborsClassifier
from sklearn.metrics import accuracy_score
for k in [3, 5, 7]:
    knn = KNeighborsClassifier(n_neighbors=k)
    knn.fit(X_train, y_train)
    y_pred = knn.predict(X_test)
    acc = accuracy_score(y_test, y_pred)
    print(f"K={k}, Accuracy={acc:.4f}")



# Task 3: Support Vector Machine (SVM) Classification
from sklearn.svm import SVC
kernels = ['linear', 'poly', 'rbf']
for kernel in kernels:
    svm = SVC(kernel=kernel, C=1.0)
    svm.fit(X_train[:10000], y_train[:10000])  # limit for performance
    y_pred = svm.predict(X_test[:2000])
    acc = accuracy_score(y_test[:2000], y_pred)
    print(f"SVM Kernel={kernel}, Accuracy={acc:.4f}")



# Task 4: Data Visualization with t-SNE
from sklearn.manifold import TSNE
import matplotlib.pyplot as plt
tsne = TSNE(n_components=2, random_state=42, perplexity=30)
X_embedded = tsne.fit_transform(X_test[:1000])
y_sample = y_test[:1000]
plt.figure(figsize=(10, 8))
scatter = plt.scatter(X_embedded[:, 0], X_embedded[:, 1], c=y_sample, cmap='tab10', s=10)
plt.title('t-SNE visualization of Fashion MNIST')
plt.colorbar(scatter, ticks=range(10))
plt.show()



# Task 5: Model Evaluation and Reporting
from sklearn.metrics import classification_report, confusion_matrix
# Use best KNN (e.g., K=5)
knn = KNeighborsClassifier(n_neighbors=5)
knn.fit(X_train, y_train)
knn_preds = knn.predict(X_test)
# Use best SVM (e.g., RBF kernel)
svm = SVC(kernel='rbf')
svm.fit(X_train[:10000], y_train[:10000])
svm_preds = svm.predict(X_test[:2000])
# Evaluation
print("KNN Classification Report:")
print(classification_report(y_test, knn_preds))
print("SVM Classification Report:")
print(classification_report(y_test[:2000], svm_preds))
print("KNN Confusion Matrix:\n", confusion_matrix(y_test, knn_preds))
print("SVM Confusion Matrix:\n", confusion_matrix(y_test[:2000], svm_preds))