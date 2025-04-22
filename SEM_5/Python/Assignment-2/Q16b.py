import math
x = float(input("Enter the value of x for series (b): "))
n = int(input("Enter the number of terms for series (b): "))
sum_b = 1
for i in range(1, n + 1):
    term = (x ** i) / math.factorial(i)
    sum_b += term
print(f"Sum of the series (b) is: {sum_b:.4f}")