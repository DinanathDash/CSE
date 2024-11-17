def topthree(num):
    d = [int(digit) for digit in str(num)]
    sort = sorted(d, reverse=True)
    return sort[0], sort[1], sort[2]
num = int(input("Enter a number: "))
print("Output in decreasing order:", topthree(num))