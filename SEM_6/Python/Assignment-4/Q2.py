import seaborn as sns
import matplotlib.pyplot as plt
from sklearn.datasets import fetch_california_housing
import pandas as pd
housing = fetch_california_housing()
df = pd.DataFrame(housing.data, columns=housing.feature_names)
df_sampled = df.sample(500, random_state=42)
sns.pairplot(df_sampled[['MedInc', 'HouseAge', 'AveRooms', 'AveOccup']])
plt.suptitle("Pairplot of California Housing Features", y=1.02)
plt.show()
