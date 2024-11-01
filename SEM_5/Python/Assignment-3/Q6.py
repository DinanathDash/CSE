def is_palindrome(s):
    s = s.lower()
    return s == s[::-1]
s1 = "madam"
s2 = "racecar"
s3 = "hello"
print(is_palindrome(s1))
print(is_palindrome(s2))
print(is_palindrome(s3))