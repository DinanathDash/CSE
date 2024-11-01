def remove_vowels(s):
    vowels = "aeiouAEIOU"
    return ''.join([char for char in s if char not in vowels])
input_string = input("Enter a string: ")
result = remove_vowels(input_string)
print(f"String after removing vowels: {result}")