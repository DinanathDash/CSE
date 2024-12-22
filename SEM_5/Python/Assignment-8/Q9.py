def safe_divide(num1, num2):
    try:
        num1 = float(num1)
        num2 = float(num2)
        if num2 == 0:
            raise ValueError("Error: Division by zero is not allowed.")
        result = num1 / num2
        return result
    except ValueError as ve:
        return str(ve)
    except Exception as e:
        return f"Error: {e}"
print(safe_divide(10, 2))
print(safe_divide(10, 0))
print(safe_divide('a', 2))
print(safe_divide(10, 'b'))
print(safe_divide('a', 'b'))