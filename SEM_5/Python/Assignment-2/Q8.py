number = int(input("Enter a positive number: "))
while number <= 0:
    number = int(input("Please enter a positive number: "))
if number % 2 == 0:
    result = number * 2
else:
    result = number ** 2
print(f"The result is: {result}")