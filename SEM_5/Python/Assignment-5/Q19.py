def unique_pairs(words):
    # Step 1: Filter words that have at least 4 letters
    valid_words = [word for word in words if len(word) >= 4]
    
    # Step 2: Initialize an empty set to store the pairs
    unique_pairs_set = set()

    # Step 3: Compare each pair of valid words
    for i in range(len(valid_words)):
        for j in range(i + 1, len(valid_words)):
            word1, word2 = valid_words[i], valid_words[j]
            
            # Step 4: Check if the words have no common letters
            if set(word1).isdisjoint(set(word2)):  # No common letters
                # Step 5: Add the pair in lexicographical order to the set
                unique_pairs_set.add(tuple(sorted([word1, word2])))

    return unique_pairs_set

# Example usage
words = ["apple", "dogs", "cat", "bird", "fish", "zebra", "lion"]
result = unique_pairs(words)
print(result)