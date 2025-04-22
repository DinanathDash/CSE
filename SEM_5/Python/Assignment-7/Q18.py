quote = "The quick brown fox jumps over the lazy dog"

# (a) Convert to uppercase
print("Output (a):", quote.upper())

# (b) Reverse the string
print("Output (b):", quote[::-1])

# (c) Extract a substring from index 4 to 19
print("Output (c):", quote[4:19])

# (d) Replace 'fox' with 'cat'
print("Output (d):", quote.replace('fox', 'cat'))

# (e) Count occurrences of 'o'
print("Output (e):", quote.count('o'))

# (f) Check if the string starts with 'The'
print("Output (f):", quote.startswith('The'))

# (g) Check if 'brown' is in the string
print("Output (g):", 'brown' in quote)

# (h) Check if all characters are lowercase
print("Output (h):", quote.islower())