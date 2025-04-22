def replace_vowels(s):
    vowels = "aeiouAEIOU"
    return ''.join(['*' if char in vowels else char for char in s])
s = input("Enter a string: ")
result = replace_vowels(s)
print(f"String after replacing vowels: {result}")