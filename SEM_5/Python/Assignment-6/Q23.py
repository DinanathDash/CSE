import pandas as pd
data = {
    'Maxine': [98.6, 99.1, 100.2],
    'James': [97.9, 98.4, 99.0],
    'Amanda': [98.2, 99.5, 100.1]
}
temperatures = pd.DataFrame(data)
print("Part (a): DataFrame named temperatures:\n", temperatures)

temperatures.index = ['Morning', 'Afternoon', 'Evening']
print("\nPart (b): DataFrame with custom indices:\n", temperatures)

maxine_temps = temperatures['Maxine']
print("\nPart (c): Column of temperature readings for Maxine:\n", maxine_temps)

morning_temps = temperatures.loc['Morning']
print("\nPart (d): Row of 'Morning' temperature readings:\n", morning_temps)

morning_evening_temps = temperatures.loc[['Morning', 'Evening']]
print("\nPart (e): Rows for 'Morning' and 'Evening' temperature readings:\n", morning_evening_temps)

amanda_maxine_temps = temperatures[['Amanda', 'Maxine']]
print("\nPart (f): Columns of temperature readings for Amanda and Maxine:\n", amanda_maxine_temps)

specific_temps = temperatures.loc[['Morning', 'Afternoon'], ['Amanda', 'Maxine']]
print("\nPart (g): Elements for Amanda and Maxine in Morning and Afternoon:\n", specific_temps)

print("\nPart (h): Descriptive statistics of temperatures:\n", temperatures.describe())

transposed_temps = temperatures.T
print("\nPart (i): Transposed DataFrame:\n", transposed_temps)

sorted_temps = temperatures.reindex(sorted(temperatures.columns), axis=1)
print("\nPart (j): DataFrame with columns sorted in alphabetical order:\n", sorted_temps)