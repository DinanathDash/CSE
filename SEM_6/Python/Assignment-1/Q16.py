import doctest
def add(a, b):
    """
    Returns the sum of two numbers.
    >>> add(2, 3)
    5
    >>> add(-1, 1)
    0
    >>> add(0, 0)
    0
    >>> add(2.5, 3.5)
    6.0
    >>> add(-5, -10)
    -15
    """
    return a + b
if __name__ == "__main__":
    doctest.testmod()

"""
How It Works:
Docstring contains test cases that specify expected outputs.
doctest.testmod() automatically runs all embedded test cases when executed.
If all tests pass, no output is shown; otherwise, failures are displayed.
"""