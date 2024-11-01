def check(char):
    char = char.lower()
    if char in 'aeiou':
        return f"{char} is a vowel"
    elif char.isalpha():
        return f"{char} is a consonant"
    else:
        return "Invalid input, please enter an alphabet"
c = input("Enter an alphabet: ")
print(check(c))