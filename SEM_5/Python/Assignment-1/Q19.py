meal_cost = float(input("Enter the cost of the meal: "))
tax_rate = 0.05
tax_amount = meal_cost * tax_rate
tip_amount = meal_cost * 0.18
grand_total = meal_cost + tax_amount + tip_amount


print("Tax amount: %.2f" %tax_amount)
print("Tip amount: %.2f" %tip_amount)
print("Grand total: %.2f" %grand_total)