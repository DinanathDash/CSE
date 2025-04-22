import numpy as np
from collections import Counter
data = [
    [2.0, 3.0, 0],
    [1.0, 1.0, 0],
    [4.0, 4.0, 1],
    [5.0, 2.0, 1],
]
P = np.array([3.0, 3.0])
distances = []
for point in data:
    coord = np.array(point[:2])
    dist = np.linalg.norm(P - coord)
    distances.append((dist, point[2]))
distances.sort(key=lambda x: x[0])
k = 3
k_neighbors = distances[:k]
classes = [cls for _, cls in k_neighbors]
most_common = Counter(classes).most_common(1)[0][0]
print(f"Predicted class for point {P}: {most_common}")
