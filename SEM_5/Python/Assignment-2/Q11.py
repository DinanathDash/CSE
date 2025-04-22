while True:
    operation = input("Enter an operation (+, -, *, /) or type 'exit' to quit: ")
    if operation == "exit":
        print("Exiting the calculator.")
        break
    num1 = float(input("Enter the first number: "))
    num2 = float(input("Enter the second number: "))
    if operation == "+":
        result = num1 + num2
    elif operation == "-":
        result = num1 - num2
    elif operation == "*":
        result = num1 * num2
    elif operation == "/":
        result = num1 / num2
    else:
        print("Invalid operator. Please enter one of +, -, *, /.")
        continue
    print(f"The result is: {result}")