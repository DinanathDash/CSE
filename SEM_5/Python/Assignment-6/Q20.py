import pandas as pd
series = pd.Series([1, 1, 3, 7, 88, 12, 88, 23, 3, 9, 0])
min_idx = series.idxmin()
max_idx = series.idxmax()
print("Smallest value index:", min_idx)
print("Largest value index:", max_idx)