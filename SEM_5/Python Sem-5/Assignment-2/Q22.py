number = input("Enter a number: ")
while len(number) > 1:
    digit_sum = sum(int(digit) for digit in number)
    number = str(digit_sum)
print(f"The single-digit sum is: {number}")