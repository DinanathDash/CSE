def word_length(s):
    words = s.split()
    l = max(len(word) for word in words)
    return l
s = "The quick brown fox jumps over the lazy dog"
print(f"The length of the longest word is: {word_length(s)}")