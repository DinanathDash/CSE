import numpy as np
arr = np.array([6951751015508907076511953879634597270226])
unique, counts = np.unique(arr, return_counts=True)
most_frequent_value = unique[counts.argmax()]
print(most_frequent_value)