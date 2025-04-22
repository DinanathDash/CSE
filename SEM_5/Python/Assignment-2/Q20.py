n = int(input("Enter an integer: "))
factors = []
factor = 2
while n > 1:
    while n % factor == 0:
        factors.append(factor)
        n //= factor
    factor += 1
print(f"The smallest factors are: {factors}.")