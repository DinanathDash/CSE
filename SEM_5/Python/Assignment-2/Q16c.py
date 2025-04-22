n = int(input("Enter the number of terms for series (c): "))
sum_c = 0
sign = 1
for i in range(1, 2 * n, 2):
    sum_c += sign * i
    sign *= -1
print(f"Sum of the series (c) is: {sum_c}")
