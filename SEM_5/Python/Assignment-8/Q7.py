def count_words_in_file(filename):
    try:
        with open(filename, 'r') as file:
            content = file.read()
            words = content.split()
            return len(words)
    except FileNotFoundError:
        print(f"The file {filename} does not exist.")
        return 0
filename = 'sample.txt'
word_count = count_words_in_file(filename)
if word_count > 0:
    print(f"The file '{filename}' contains {word_count} words.")