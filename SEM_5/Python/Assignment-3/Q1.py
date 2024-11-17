def topthree(num):
    d = [int(digit) for digit in num]
    sort = sorted(d, reverse=True)
    return sort[0], sort[1], sort[2]
num = input("Enter a number: ")
print("Output in decreasing order:", topthree(num))