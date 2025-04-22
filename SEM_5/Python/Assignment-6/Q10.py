import numpy as np
arr = np.arange(1, 16).reshape(3, 5)
print("3x5 Array:\n", arr)
print("\n(a) Row 2:\n", arr[2])
print("\n(b) Column 5:\n", arr[:, 4])
print("\n(c) Rows 0 and 1:\n", arr[0:2])
print("\n(d) Columns 2–4:\n", arr[:, 2:5])
print("\n(e) Element in row 1 and column 4:\n", arr[1, 4])
print("\n(f) Elements from rows 1 and 2 in columns 0, 2, and 4:\n", arr[1:3, [0, 2, 4]])