n = 5
for i in range(n):
    print(' ' * (n - i - 1), end='')
    if i == 0:
        print('*')
    else:
        print('*', end='')
        print(' ' * (2 * i - 1), end='')
        print('*')
print('*' * (2 * n - 1))