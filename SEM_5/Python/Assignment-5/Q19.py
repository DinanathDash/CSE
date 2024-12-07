def unique_pairs(words):
    valid_words = [word for word in words if len(word) >= 4]
    unique_pairs_set = set()
    for i in range(len(valid_words)):
        for j in range(i + 1, len(valid_words)):
            word1, word2 = valid_words[i], valid_words[j]
            if set(word1).isdisjoint(set(word2)):
                unique_pairs_set.add(tuple(sorted([word1, word2])))
    return unique_pairs_set
words = ["apple", "dogs", "cat", "bird", "fish", "zebra", "lion"]
result = unique_pairs(words)
print(result)