import pandas as pd
import matplotlib.pyplot as plt
celsius_to_kelvin = lambda c: c + 273.15
celsius_values = list(range(-10, 41, 5))
kelvin_values = [celsius_to_kelvin(c) for c in celsius_values]
df = pd.DataFrame({"Celsius (°C)": celsius_values, "Kelvin (K)": kelvin_values})
print(df)
plt.plot(df["Celsius (°C)"], df["Kelvin (K)"], marker="o", linestyle="-", color="b")
plt.xlabel("Celsius (°C)")
plt.ylabel("Kelvin (K)")
plt.title("Celsius to Kelvin Conversion")
plt.grid(True)
plt.show()
