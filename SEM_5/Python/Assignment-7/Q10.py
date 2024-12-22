def reverse_tokens(text):
    tokens = text.split()
    reversed_tokens = tokens[::-1]
    return " ".join(reversed_tokens)
line = "This is an example line of text"
result = reverse_tokens(line)
print(f"Reversed tokens: {result}")