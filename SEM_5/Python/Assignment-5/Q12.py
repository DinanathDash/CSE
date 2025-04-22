def count_duplicate_words(s):
    s = s.lower()
    words = s.split()
    word_count = {}
    for word in words:
        word_count[word] = word_count.get(word, 0) + 1
    duplicate_count = 0
    print("Duplicate words:")
    for word, count in word_count.items():
        if count > 1:
            print(f"'{word}': {count}")
            duplicate_count += 1
    print(f"Total number of duplicate words: {duplicate_count}")
s = input("Enter a sentence: ")
count_duplicate_words(s)