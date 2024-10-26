from collections import Counter
def can_form_palindrome(s):
    freq = Counter(s)
    odd_count = sum(1 for count in freq.values() if count % 2 != 0)
    return odd_count <= 1
input_string_1 = "civic"
input_string_2 = "ivicc"
input_string_3 = "hello"
print(can_form_palindrome(input_string_1))
print(can_form_palindrome(input_string_2))
print(can_form_palindrome(input_string_3))
