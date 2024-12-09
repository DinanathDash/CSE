import pandas as pd
L = ["Cry", "Apple", "Orange", "Sky", "Banana"]
series = pd.Series(L)
vowel_series = series[series.str[0].str.lower().isin(["a", "e", "i", "o", "u"])]
print("Series with elements starting with a vowel:\n", vowel_series)