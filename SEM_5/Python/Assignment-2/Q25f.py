n = 4
for i in range(n):
    print(' ' * (n - i - 1) + '*' * (2 * i + 1))
for i in range(n - 1):
    print(' ' * (i + 1) + '*' * (2 * (n - i - 2) + 1))