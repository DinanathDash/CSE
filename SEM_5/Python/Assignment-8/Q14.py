def inverse1():
    try:
        num = input("Enter the number: ")
        num = float(num)
        inverse = 1.0 / num
    except ValueError:
        print("ValueError: Invalid input, not a number.")
    except TypeError:
        print("TypeError: Invalid type for operation.")
    except ZeroDivisionError:
        print("ZeroDivisionError: Division by zero is not allowed.")
    except Exception as e:
        print(f"Unexpected error: {e}")
    else:
        print(f"Inverse: {inverse}")
    finally:
        print("Function inverse completed")
inverse1() 