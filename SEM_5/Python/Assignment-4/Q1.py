import random
n = int(input("Enter the size of the list: "))
l = [random.randint(1, 100) for _ in range(n)]
avg = sum(l) / n if n > 0 else 0
print("Random List:", l)
print("Sum:", sum(l))
print("Average:", avg)