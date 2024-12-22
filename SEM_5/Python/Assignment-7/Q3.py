def count_words(s):
    words = s.split()
    return len(words)
s = "This is an example sentence."
print(f"Number of words: {count_words(s)}")