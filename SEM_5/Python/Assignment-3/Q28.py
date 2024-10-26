def shift_string(s):
    shifted_string = ''
    for char in s:
        if char == 'z':
            shifted_string += 'a'
        else:
            shifted_string += chr(ord(char) + 1)
    return shifted_string
input_string = input("Enter a string of lowercase alphabets: ")
result = shift_string(input_string)
print(f"Shifted string: {result}")
