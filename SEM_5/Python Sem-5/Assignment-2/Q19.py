n = input("Enter a positive integer: ")
if n.isdigit():
    reversed_n = n[::-1]
    print(f"The reversed number is: {reversed_n}")
else:
    print("Please enter a valid positive integer.")