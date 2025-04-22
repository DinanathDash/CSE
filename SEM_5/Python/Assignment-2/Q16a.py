import math
x = float(input("Enter the value of x for series (a): "))
n = int(input("Enter the number of terms for series (a): "))
sum_a = 1
sign = -1
for i in range(1, n + 1):
    term = sign * (x ** (2 * i)) / math.factorial(2 * i)
    sum_a += term
    sign *= -1
print(f"Sum of the series (a) is: {sum_a:.4f}")