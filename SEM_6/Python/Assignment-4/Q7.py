from sklearn.datasets import load_iris
from sklearn.model_selection import KFold, cross_val_score
from sklearn.neighbors import KNeighborsClassifier
import matplotlib.pyplot as plt
import numpy as np
iris = load_iris()
X, y = iris.data, iris.target
kf = KFold(n_splits=5, shuffle=True, random_state=42)
k_range = range(1, 21)
mean_scores = []
for k in k_range:
    model = KNeighborsClassifier(n_neighbors=k)
    scores = cross_val_score(model, X, y, cv=kf)
    mean_scores.append(scores.mean())
best_k = k_range[np.argmax(mean_scores)]
print(f"Optimal k: {best_k}")
print(f"Accuracy: {max(mean_scores):.4f}")
plt.figure(figsize=(10, 5))
plt.plot(k_range, mean_scores, marker='o')
plt.xlabel('k (Number of Neighbors)')
plt.ylabel('Average Accuracy')
plt.title('KNN Accuracy with Cross-Validation (Iris Dataset)')
plt.grid(True)
plt.show()
