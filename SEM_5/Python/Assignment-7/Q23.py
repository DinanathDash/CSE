def delete_char_at_index(s, i):
    if i < 0 or i >= len(s):
        return "Invalid index"
    return s[:i] + s[i+1:]
s = input("Enter a string: ")
i = int(input("Enter the index to delete: "))
result = delete_char_at_index(s, i)
print(f"Resulting string: {result}")