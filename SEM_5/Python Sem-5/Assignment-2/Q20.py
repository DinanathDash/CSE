n = int(input("Enter an integer: "))
original_n = n
factors = []
factor = 2
while n > 1:
    while n % factor == 0:
        factors.append(factor)
        n //= factor
    factor += 1
print(f"The smallest factors of {original_n} are: {', '.join(map(str, factors))}.")