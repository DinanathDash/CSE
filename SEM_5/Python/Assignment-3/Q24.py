import string
def rem(s):
    return ''.join(char for char in s if char not in string.punctuation)
str = input("Enter a string: ")
result = rem(str)
print(f"String without punctuation: {result}")