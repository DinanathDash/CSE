from collections import Counter
import numpy as np
arr = np.array([6, 9, 5, 1, 7, 5, 1, 0, 1, 5, 5, 0, 8, 9, 0, 7, 0, 7, 6, 5, 1, 1, 9, 5, 3, 8, 7, 9, 6, 3, 4, 5, 9, 7, 2, 7, 0, 2, 2, 6])
count = Counter(arr)
max_freq = max(count.values())
most_frequent = [key for key, val in count.items() if val == max_freq]
print(f"Most frequent values: {most_frequent} with frequency {max_freq}")