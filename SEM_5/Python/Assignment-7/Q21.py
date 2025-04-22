import re
string1 = "Python Programming Language"

# (a) Check if the entire string contains only alphabetic characters
match1 = re.fullmatch(r'[A-Za-z]*', string1)
print("Output (a):", match1.group() if match1 else "No match")

# (b) Replace 'Programming' with 'Coding'
match2 = re.sub(r'Programming', 'Coding', string1)
print("Output (b):", match2)

# (c) Split the string using the '+' character (no '+' character present)
# Fix: Escape the '+' character with '\+' in the regex
match3 = re.split(r'\+', string1)
print("Output (c):", match3)

# (d) Find all occurrences of the '+' character (none present)
match8 = re.findall(r'\+', string1)
print("Output (d):", match8)