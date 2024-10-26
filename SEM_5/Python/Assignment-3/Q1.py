def find_top_three_digits(num):
    digits = [int(digit) for digit in str(num)]
    sorted_digits = sorted(digits, reverse=True)
    top_three = []
    for digit in sorted_digits:
        if digit not in top_three:
            top_three.append(digit)
        if len(top_three) == 3:
            break
    
    return top_three
num = int(input("Enter a number: "))
result = find_top_three_digits(num)
print("Output:", result)