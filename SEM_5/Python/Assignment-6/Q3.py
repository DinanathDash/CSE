import numpy as np
even_array = np.arange(2, 19, 2).reshape(3, 3)
decreasing_array = np.arange(9, 0, -1).reshape(3, 3)
multiplied_array = even_array * decreasing_array
print("Multiplied array:\n", multiplied_array)