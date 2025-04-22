def filter_words_starting_b_ending_d(line):
    tokens = line.split()
    filtered_words = [word for word in tokens if word.lower().startswith('b') and word.lower().endswith('d')]
    return filtered_words
line = "The bold bird baked bread beyond the border."
result = filter_words_starting_b_ending_d(line)
print(f"Filtered words: {result}")