"""
(a) Nested Loops
def example1(n):
    for i in range(n):  # Runs n times
        for j in range(n):  # Runs n times for each i
            print(i, j)  # O(1) operation
Time Complexity: O(n²)
The outer loop runs n times.
The inner loop runs n times for each iteration of the outer loop.
Total iterations: n x n = n².
Big O Complexity: O(n²) (Quadratic time).

(b) Single Loop
for i in range(n):  # Runs n times
    print(i)  # O(1) operation
Time Complexity: O(n)
The loop runs n times.
Each iteration performs a constant-time operation (O(1)).
Big O Complexity: O(n) (Linear time).

(c) Recursive Function
def recursive_function(n):
    if n <= 1:
        return 1
    return recursive_function(n - 1) + recursive_function(n - 1)
Time Complexity: O(2ⁿ)
This is a tree recursion, where each call spawns two recursive calls.
The number of recursive calls forms a binary tree of depth n.
The total number of calls is approximately 2ⁿ in the worst case.
Big O Complexity: O(2ⁿ) (Exponential time).
"""