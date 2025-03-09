"""Recursive Solution"""
def fibonacci_recursive(n):
    if n <= 1:
        return n
    return fibonacci_recursive(n - 1) + fibonacci_recursive(n - 2)

n = int(input("Enter n: "))
print(f"Fibonacci({n}) =", fibonacci_recursive(n))
"""Time Complexity Analysis:
Each call to fibonacci_recursive(n) makes two recursive calls.
This results in an exponential time complexity: O(2ⁿ)."""

"""Iterative Approach"""
def fibonacci_iterative(n):
    if n <= 1:
        return n
    a, b = 0, 1
    for _ in range(2, n + 1):
        a, b = b, a + b
    return b

n = int(input("Enter n: "))
print(f"Fibonacci({n}) =", fibonacci_iterative(n))
"""Time Complexity: O(n), but without the overhead of recursion."""

"""
Comparison:
Approach	Time Complexity	    Space Complexity	Notes
Recursive	    O(2ⁿ)	            O(n)            (due to call stack)	Very slow for large n
Memoized	    O(n)	            O(n)	        Avoids redundant calculations
Iterative	    O(n)	            O(1)	        Most efficient in both time & space
"""