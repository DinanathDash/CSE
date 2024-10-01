num = input("Enter a number: ")
while len(num) > 1:
    digit_sum = sum(int(digit) for digit in num)
    num = str(digit_sum)
print(f"The single-digit sum is: {num}")