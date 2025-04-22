import pandas as pd
from sklearn.linear_model import LinearRegression
import numpy as np
import matplotlib.pyplot as plt
annual_df = pd.read_csv('annual_avg_temp.csv', skiprows=4)
january_df = pd.read_csv('january_high_temp.csv', skiprows=4)
annual_df.columns = ['Year', 'AnnualAvgTemp']
january_df.columns = ['Year', 'JanuaryHighTemp']
merged_df = pd.merge(annual_df, january_df, on='Year')
X = merged_df['Year'].values.reshape(-1, 1)
y_annual = merged_df['AnnualAvgTemp'].values
y_january = merged_df['JanuaryHighTemp'].values
model_annual = LinearRegression().fit(X, y_annual)
model_january = LinearRegression().fit(X, y_january)
annual_pred = model_annual.predict(X)
january_pred = model_january.predict(X)
annual_trend = model_annual.coef_[0]
january_trend = model_january.coef_[0]
plt.figure(figsize=(14, 7))
plt.plot(merged_df['Year'], y_annual, label='Annual Avg Temp', color='blue', alpha=0.6)
plt.plot(merged_df['Year'], annual_pred, label=f'Annual Trend ({annual_trend:.2f}°F/year)', color='blue', linestyle='--')
plt.plot(merged_df['Year'], y_january, label='January High Temp', color='red', alpha=0.6)
plt.plot(merged_df['Year'], january_pred, label=f'January Trend ({january_trend:.2f}°F/year)', color='red', linestyle='--')
plt.title('Temperature Trends in New York City (1895-2025)')
plt.xlabel('Year')
plt.ylabel('Temperature (°F)')
plt.legend()
plt.grid(True)
plt.tight_layout()
plt.show()
