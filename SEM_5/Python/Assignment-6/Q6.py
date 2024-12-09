import numpy as np
arr = np.array([2**i for i in range(6)]).reshape(2, 3)
arr1 = arr.flatten()
print("Flatten Array: ", arr1)
print("Array: ", arr)
arr2 = arr.ravel()
print("Ravel Array: ", arr2)
print("Array: ", arr)