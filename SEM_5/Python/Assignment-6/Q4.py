import numpy as np
array = np.array([[1, 2, 3], [4, 5, 6], [7, 8, 9]])
array[[0, 1]] = array[[1, 0]]
array[:, [0, 1]] = array[:, [1, 0]]
print(array)