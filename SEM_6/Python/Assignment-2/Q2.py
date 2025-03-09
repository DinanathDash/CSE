def gcd(x, y):
    if y == 0:
        return x
    return gcd(y, x % y)

x = int(input("Enter first number: "))
y = int(input("Enter second number: "))
print(f"GCD of {x} and {y} is", gcd(x, y))