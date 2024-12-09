import numpy as np
from scipy import stats
def median(arr):
    return np.median(arr)
def mode(arr):
    mode_result = stats.mode(arr, axis=None, keepdims=False)
    return mode_result.mode if isinstance(mode_result.mode, (int, np.integer)) else mode_result.mode[0]
arrays = [
    np.random.randint(0, 10, (3, 3)),
    np.random.randint(0, 10, (4, 4)),
    np.random.randint(0, 10, (2, 5))
]
for i, arr in enumerate(arrays, 1):
    print(f"Array {i}:\n{arr}")
    print(f"Median: {median(arr)}, Mode: {mode(arr)}\n")