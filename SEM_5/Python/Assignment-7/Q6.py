def replace_vowels(s):
    vowel_map = {'a': 'e', 'e': 'i', 'i': 'o', 'o': 'u', 'u': 'a',
                 'A': 'E', 'E': 'I', 'I': 'O', 'O': 'U', 'U': 'A'}
    return ''.join(vowel_map[char] if char in vowel_map else char for char in s)
text = "Hello, how are you?"
result = replace_vowels(text)
print(result)