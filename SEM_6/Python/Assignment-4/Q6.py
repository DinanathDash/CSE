import numpy as np
from collections import Counter
data = [
    [85, 90, 88, 'Pass'],
    [70, 75, 80, 'Pass'],
    [60, 65, 70, 'Fail'],
    [50, 55, 58, 'Fail'],
    [95, 92, 96, 'Pass'],
    [45, 50, 48, 'Fail'],
]
new_student = np.array([72, 78, 75])
distances = []
for row in data:
    scores = np.array(row[:3])
    label = row[3]
    dist = np.linalg.norm(new_student - scores)
    distances.append((dist, label))
k = 3
distances.sort(key=lambda x: x[0])
k_neighbors = distances[:k]
labels = [label for _, label in k_neighbors]
most_common = Counter(labels).most_common(1)[0][0]
print(f"Predicted class for the new student: {most_common}")
