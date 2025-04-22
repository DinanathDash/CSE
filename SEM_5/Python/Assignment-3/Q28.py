def shift_string(s):
    shifted_string = ''
    for char in s:
        if char == 'z':
            shifted_string += 'a'
        else:
            shifted_string += chr(ord(char) + 1)
    return shifted_string
s = input("Enter a string of lowercase alphabets: ")
result = shift_string(s)
print(f"Shifted string: {result}")