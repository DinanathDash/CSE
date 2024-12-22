import re
string1 = "Python Programming Language"

# (a) Match any character followed by an optional 'm'
match1 = re.search('. m?', string1)
print("Output (a):", match1.group() if match1 else "No match")

# (b) Match any character followed by 'Language' at the end
match3 = re.search('.*Language$', string1)
print("Output (b):", match3.group() if match3 else "No match")

# (c) Match 'w* s w*' pattern (this will not match)
match4 = re.search(' w* s w*', string1)
print("Output (c):", match4.group() if match4 else "No match")

# (d) Match the entire string
match5 = re.search('.*', string1)
print("Output (d):", match5.group() if match5 else "No match")