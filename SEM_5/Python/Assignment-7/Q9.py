def count_vowels_and_consonants(s):
    vowels = set("aeiouAEIOU")
    vowel_count = 0
    consonant_count = 0

    for char in s:
        if char.isalpha():
            if char in vowels:
                vowel_count += 1
            else:
                consonant_count += 1

    return vowel_count, consonant_count
text = "Hello, World!"
vowels, consonants = count_vowels_and_consonants(text)
print(f"Number of vowels: {vowels}")
print(f"Number of consonants: {consonants}")