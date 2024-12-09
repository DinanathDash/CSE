import numpy as np
random_array = np.random.randint(0, 100, (5, 5))
counts = np.bincount(random_array.flatten(), minlength=100)
print("Random array:\n", random_array)
print("Occurrences of each number (0–99):\n", counts)