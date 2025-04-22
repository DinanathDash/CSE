import numpy as np
import matplotlib.pyplot as plt
from sklearn.cluster import KMeans
data = np.array([
    [1, 1],
    [2, 2],
    [3, 3],
    [8, 8],
    [9, 9],
    [10, 10]
])
kmeans = KMeans(n_clusters=2, random_state=0, n_init='auto')
kmeans.fit(data)
labels = kmeans.labels_
centers = kmeans.cluster_centers_
plt.figure(figsize=(6, 6))
colors = ['red', 'blue']
for i in range(2):
    cluster_points = data[labels == i]
    plt.scatter(cluster_points[:, 0], cluster_points[:, 1], color=colors[i], label=f'Cluster {i+1}')
plt.scatter(centers[:, 0], centers[:, 1], s=200, c='black', marker='X', label='Centroids')
plt.title("K-Means Clustering (k=2)")
plt.xlabel("X")
plt.ylabel("Y")
plt.legend()
plt.grid(True)
plt.tight_layout()
plt.show()
