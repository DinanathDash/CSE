import numpy as np
arr = np.array([2**i for i in range(6)]).reshape(2, 3)
arr1 = arr.flatten()
print(f"Flatten Array: ", arr1)
print(f"Array: ", arr)
arr2 = arr.ravel()
print(f"Ravel Array: ", arr2)
print(f"Array: ", arr)