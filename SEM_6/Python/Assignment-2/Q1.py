def power(base, exponent):
    if exponent == 1:
        return base
    return base * power(base, exponent - 1)

base = int(input("Enter base: "))
exponent = int(input("Enter exponent: "))
if exponent < 1:
    print("Exponent must be greater than or equal to 1.")
else:
    print(f"{base}^{exponent} =", power(base, exponent))