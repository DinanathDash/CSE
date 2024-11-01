def sos():
    squares = [num ** 2 for num in range(1, 51) if num % 2 == 0]
    return sum(squares)
print(sos())