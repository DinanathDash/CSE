import numpy as np
array1 = np.array([[0, 1], [2, 3]])
array2 = np.array([[4, 5], [6, 7]])
array3 = np.vstack((array1, array2))
print("\n(a) Vertical stacking of array1 and array2 (array3):\n", array3)
array4 = np.hstack((array1, array2))
print("\n(b) Horizontal stacking of array1 and array2 (array4):\n", array4)
array5 = np.vstack((array4, array4))
print("\n(c) Vertical stacking of two copies of array4 (array5):\n", array5)
array6 = np.hstack((array3, array3))
print("\n(d) Horizontal stacking of two copies of array3 (array6):\n", array6)