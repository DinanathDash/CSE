def count_words_and_vowels(filename):
    try:
        with open(filename, 'r') as file:
            content = file.read()
            word_count = 0
            vowel_count = 0
            vowels = set("aeiouAEIOU")
            for char in content:
                if char.isalpha():
                    if char in vowels:
                        vowel_count += 1
            word_count = len(content.split())
            print(f"Number of words: {word_count}")
            print(f"Number of vowels: {vowel_count}")
    except FileNotFoundError:
        print(f"Error: The file '{filename}' does not exist.")
count_words_and_vowels('file1.txt')