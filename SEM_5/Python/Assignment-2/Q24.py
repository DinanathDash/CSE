digit_to_word = {
    '0': 'ZERO', '1': 'ONE', '2': 'TWO', '3': 'THREE', '4': 'FOUR', '5': 'FIVE', '6': 'SIX', '7': 'SEVEN', '8': 'EIGHT', '9': 'NINE'
}
n = input("Enter an integer: ")
result = ""
for digit in n:
    if digit in digit_to_word:
        result += digit_to_word[digit]
print("The digits that have appeared are:", result)