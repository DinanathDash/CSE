import re
def count_string_components(s):
    digits = len(re.findall(r'\d', s))
    non_digits = len(re.findall(r'\D', s))
    whitespace = len(re.findall(r'\s', s))
    words = len(re.findall(r'\w+', s))
    return digits, non_digits, whitespace, words
s = input("Enter a string: ")
digits, non_digits, whitespace, words = count_string_components(s)
print(f"Number of digits: {digits}")
print(f"Number of non-digits: {non_digits}")
print(f"Number of whitespace characters: {whitespace}")
print(f"Number of words: {words}")