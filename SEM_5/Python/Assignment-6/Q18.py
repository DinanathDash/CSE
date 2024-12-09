import pandas as pd
import numpy as np
df = pd.DataFrame(np.random.randint(1, 100, (5, 3)), columns=["A", "B", "C"])
first_col = df["A"]
print("DataFrame:\n", df)
print("First column as Series:\n", first_col)