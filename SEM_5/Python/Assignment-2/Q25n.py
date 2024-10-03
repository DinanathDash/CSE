start = 65
n = 7
for i in range(1, n + 1):
    for j in range(i):
        print(chr(start), end='')
        start += 1
    print()