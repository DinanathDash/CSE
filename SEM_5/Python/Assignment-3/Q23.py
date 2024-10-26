def vowel_indices(s):
    vowels = "aeiouAEIOU"
    indices = []
    for i in range(len(s)):
        if s[i] in vowels:
            indices.append(i)
    return indices
input_string = input("Enter a string: ")
vowel_positions = vowel_indices(input_string)
print(f"The indices of vowels in the string are: {vowel_positions}")
