def vowel_indices(s):
    vowels = "aeiouAEIOU"
    indices = []
    for i in range(len(s)):
        if s[i] in vowels:
            indices.append(i)
    return indices
input_str = input("Enter a string: ")
vowel_pos = vowel_indices(input_str)
print(f"The indices of vowels in the string are: {vowel_pos}")