import numpy as np
def median(arr):
    return np.median(arr)
def mode(arr):
    vals, counts = np.unique(arr, return_counts=True)
    return vals[counts == counts.max()]
arrays = [
    np.random.randint(0, 10, (3, 3)),
    np.random.randint(0, 10, (4, 4)),
    np.random.randint(0, 10, (2, 5))
]
for i, arr in enumerate(arrays, 1):
    print(f"Array {i}:\n{arr}")
    print(f"Median: {median(arr)}, Mode: {mode(arr)}\n")