import numpy as np
arr = np.random.rand(4, 4)
sorted_array = np.sort(arr, axis=0)
print("Original 4x4 array:\n", arr)
print("Column-wise sorted array:\n", sorted_array)