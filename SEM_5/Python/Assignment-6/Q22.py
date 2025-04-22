import pandas as pd
import numpy as np
series_a = pd.Series([7, 11, 13, 17])
print("Part (a): Series from list:\n", series_a)
series_b = pd.Series([100.0] * 5)
print("\nPart (b): Series with five elements of 100.0:\n", series_b)
series_c = pd.Series(np.random.randint(0, 101, 20))
print("\nPart (c): Series with 20 random numbers:\n", series_c)
print("Descriptive statistics:\n", series_c.describe())
temperatures = pd.Series(
    [98.6, 98.9, 100.2, 97.9],
    index=["Julie", "Charlie", "Sam", "Andrea"]
)
print("\nPart (d): Temperatures Series:\n", temperatures)
temp_dict = temperatures.to_dict()
new_series = pd.Series(temp_dict)
print("\nPart (e): Dictionary created from Part (d):\n", temp_dict)
print("Series initialized from dictionary:\n", new_series)