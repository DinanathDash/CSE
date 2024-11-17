import math
def mean(n):
    return sum(n) / len(n)
def sd(n):
    m = mean(n)
    v = sum((x - m) ** 2 for x in n) / (len(n) - 1)
    return math.sqrt(v)

num = list(map(float, input("Enter numbers separated by spaces: ").split()))
if len(num) != 10:
    print("Please enter exactly ten numbers.")
else:
    print(f"The mean is {mean(num):.2f}")
    print(f"The standard deviation is {sd(num):.5f}")