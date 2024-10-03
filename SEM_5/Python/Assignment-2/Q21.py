n = int(input("Enter a number: "))
factorial = 1
i = 1
while factorial < n:
    i += 1
    factorial *= i
if factorial == n:
    print(f"{n} is a factorial number ({i}! = {n}).")
else:
    print(f"{n} is not a factorial number.")