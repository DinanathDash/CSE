while True:
    operation = input("Enter an operation (+, -, *, /) or type 'exit' to quit: ")
    if operation == "exit":
        print("Exiting the calculator.")
        break
    num1 = input("Enter the first number: ")
    num2 = input("Enter the second number: ")
    try:
        num1 = float(num1)
        num2 = float(num2)
    except ValueError:
        print("Invalid input, please enter valid numbers.")
        continue
    if operation == "+":
        result = num1 + num2
    elif operation == "-":
        result = num1 - num2
    elif operation == "*":
        result = num1 * num2
    elif operation == "/":
        if num2 == 0:
            print("Error: Division by zero is not allowed.")
            continue
        result = num1 / num2
    else:
        print("Invalid operator. Please enter one of +, -, *, /.")
        continue
    print(f"The result is: {result}")