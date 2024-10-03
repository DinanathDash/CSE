count = 0
for num in range(100, 1001):
    if num % 5 == 0 or num % 6 == 0:
        print(num, end=' ')
        count += 1
        if count == 10:
            print()
            count = 0
if count > 0:
    print()