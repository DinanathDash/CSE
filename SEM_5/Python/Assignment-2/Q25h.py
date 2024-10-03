n = 4
for i in range(n):
    print(' ' * (n - i - 1), end='')
    if i == 0:
        print('*')
    else:
        print('*', end='')
        print(' ' * (2 * i - 1), end='')
        print('*')

for i in range(n - 2, -1, -1):
    print(' ' * (n - i - 1), end='')
    if i == 0:
        print('*')
    else:
        print('*', end='')
        print(' ' * (2 * i - 1), end='')
        print('*')