def multi(n):
    l = []
    for i in range(1, n + 1):
        l.append([i * j for j in range(1, 6)])
    return l
n = int(input("Enter a number n: "))
print("List of multiples:")
for i, multi in enumerate(multi(n), start=1):
    print(f"Multiples of {i}: {multi}")