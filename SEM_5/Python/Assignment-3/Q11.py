from collections import Counter
def palindrome(s):
    freq = Counter(s)
    odd_count = sum(1 for count in freq.values() if count % 2 != 0)
    return odd_count <= 1
s1 = "civic"
s2 = "ivicc"
s3 = "hello"
print(palindrome(s1))
print(palindrome(s2))
print(palindrome(s3))