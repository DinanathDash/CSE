def fibonacci(n):
    if n <= 0:
        return "Input should be a positive integer."
    elif n == 1:
        return 0
    elif n == 2:
        return 1
    a, b = 0, 1
    for _ in range(3, n + 1):
        a, b = b, a + b
    return b
n = int(input("Enter the position of the Fibonacci sequence: "))
nth_fib = fibonacci(n)
print(f"The {n}th Fibonacci number is: {nth_fib}")