def is_prime(num):
    if num < 2:
        return False
    for i in range(2, int(num ** 0.5) + 1):
        if num % i == 0:
            return False
    return True
print("Prime numbers between 1 and 100 are:")
for num in range(1, 101):
    if is_prime(num):
        print(num, end=" ")