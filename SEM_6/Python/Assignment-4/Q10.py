import pandas as pd
import numpy as np
# (a)
series_a = pd.Series([7, 11, 13, 17])
print("Series a:\n", series_a, "\n")
# (b)
series_b = pd.Series([100.0] * 5)
print("Series b:\n", series_b, "\n")
# (c)
series_c = pd.Series(np.random.randint(0, 101, size=20))
print("Series c:\n", series_c, "\n")
print("Descriptive statistics:\n", series_c.describe(), "\n")
# (d)
temperatures = pd.Series(
    [98.6, 98.9, 100.2, 97.9],
    index=['Julie', 'Charlie', 'Sam', 'Andrea']
)
print("Series d:\nTemperatures Series:\n", temperatures, "\n")
# (e)
temp_dict = temperatures.to_dict()
series_from_dict = pd.Series(temp_dict)
print("Series e:\nSeries from dictionary:\n", series_from_dict)
