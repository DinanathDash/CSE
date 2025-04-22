def reverse_middle_half(s):
    n = len(s)
    if n < 4:
        return s
    start = n // 4
    end = n - start
    middle_reversed = s[start:end][::-1]
    return s[:start] + middle_reversed + s[end:]
string = "abcdefghij"
result = reverse_middle_half(string)
print(f"Original: {string}")
print(f"Modified: {result}")