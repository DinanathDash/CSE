def topthree(num):
    d = [int(digit) for digit in num]
    sort = sorted(d, reverse=True)
    return sort[0:3]
num = input("Enter a number: ")
print("Output in decreasing order:", topthree(num))