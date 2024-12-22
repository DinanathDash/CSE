def palindrome(s):
    def palindrome(check_s):
        return check_s == check_s[::-1]
    doubled = s + s
    for i in range(len(s)):
        if palindrome(doubled[i:i + len(s)]):
            return True 
    return False
text = "aab"
result = palindrome(text)
print(f"Is '{text}' a rotational palindrome? {result}")