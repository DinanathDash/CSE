def c_sum(num):
    l = []
    total = 0
    for i in num:
        total += i
        l.append(total)
    return l
n = list(map(int, input("Enter numbers separated by spaces: ").split()))
print("Cumulative list:", c_sum(n))