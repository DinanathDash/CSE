def topthree(num):
    d = [int(digit) for digit in str(num)]
    sort = sorted(d, reverse=True)
    a = []
    for digit in sort:
        if digit not in a:
            a.append(digit)
        if len(a) == 3:
            break
    return a
num = int(input("Enter a number: "))
print("Output:", topthree(num))