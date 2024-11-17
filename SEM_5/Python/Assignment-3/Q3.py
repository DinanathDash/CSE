def sos():
    squares = [num ** 2 for num in range(2, 51, 2)]
    return sum(squares)
print(sos())