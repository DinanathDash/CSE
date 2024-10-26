def is_palindrome(s):
    s = s.lower()
    return s == s[::-1]
input_string_1 = "madam"
input_string_2 = "racecar"
input_string_3 = "hello"

print(is_palindrome(input_string_1))
print(is_palindrome(input_string_2))
print(is_palindrome(input_string_3))
