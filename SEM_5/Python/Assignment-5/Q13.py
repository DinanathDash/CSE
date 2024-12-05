def unique_words(word_list):
    unique_words = set(word.lower() for word in word_list)
    sorted_unique_words = sorted(unique_words)
    print("Unique words in alphabetical order:")
    for word in sorted_unique_words:
        print(word)
s1 = "This is a test sentence and this is a test"
s2 = "Hello world hello Python python"
s3 = "Unique words should be displayed sorted"
unique_words(s1.split())
unique_words(s2.split())
unique_words(s3.split())