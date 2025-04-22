quote = "Knowledge is power. Power is gained through knowledge."

# (a) Find the first occurrence of 'power'
print("Output (a):", quote.find('power'))

# (b) Find the last occurrence of 'knowledge'
print("Output (b):", quote.rfind('knowledge'))

# (c) Title case the string
print("Output (c):", quote.title())

# (d) Convert the string to lowercase
print("Output (d):", quote.lower())

# (e) Convert the string to uppercase
print("Output (e):", quote.upper())

# (f) Check if the string ends with 'knowledge.'
print("Output (f):", quote.endswith('knowledge.'))

# (g) Split the string by spaces
print("Output (g):", quote.split(' '))

# (h) Partition the string at the first occurrence of 'is'
print("Output (h):", quote.partition('is'))

# (i) Check if the string contains only alphabetic characters
print("Output (i):", quote.isalpha())