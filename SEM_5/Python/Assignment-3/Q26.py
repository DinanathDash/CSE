def replace_vowels(s):
    vowels = "aeiouAEIOU"
    return ''.join(['*' if char in vowels else char for char in s])
input_string = input("Enter a string: ")
result = replace_vowels(input_string)
print(f"String after replacing vowels: {result}")
