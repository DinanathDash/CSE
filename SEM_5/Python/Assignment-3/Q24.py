import string
def remove_punctuation(s):
    return ''.join(char for char in s if char not in string.punctuation)
input_string = input("Enter a string: ")
result = remove_punctuation(input_string)
print(f"String without punctuation: {result}")
