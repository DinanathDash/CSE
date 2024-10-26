def check_vowel_consonant(char):
    char = char.lower()
    if char in 'aeiou':
        return f"{char} is a vowel"
    elif char.isalpha():
        return f"{char} is a consonant"
    else:
        return "Invalid input, please enter an alphabet"
char_input = input("Enter an alphabet: ")
result = check_vowel_consonant(char_input)
print(result)
