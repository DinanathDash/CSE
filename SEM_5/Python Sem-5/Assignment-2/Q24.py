number = input("Enter an integer: ")
digit_words = ["ZERO", "ONE", "TWO", "THREE", "FOUR", "FIVE", "SIX", "SEVEN", "EIGHT", "NINE"]

appeared_digits = set()

for char in number:
    if char.isdigit():
        appeared_digits.add(char)

sorted_digits = sorted(appeared_digits)

output = ""
for digit in sorted_digits:
    output += digit_words[int(digit)]

print(output)