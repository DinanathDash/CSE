import pandas as pd
s1 = pd.Series([1, 2, 3, 4, 2])
s2 = pd.Series([3, 4, 5, 6])
not_in_s2 = s1[~s1.isin(s2)]
print("Elements in s1 not in s2:\n", not_in_s2)