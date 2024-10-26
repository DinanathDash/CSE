def sum_of_squares_of_even_numbers():
    squares = [num ** 2 for num in range(1, 51) if num % 2 == 0]
    return sum(squares)
result = sum_of_squares_of_even_numbers()
print(result)
