import numpy as np
arr1 = np.array([[0, 1], [2, 3]])
arr2 = np.array([[4, 5], [6, 7]])
arr3 = np.concatenate((arr1, arr2), axis=0)
print("Concatenate result:\n", arr3)