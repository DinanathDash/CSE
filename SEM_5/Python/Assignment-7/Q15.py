from collections import Counter
def substrings_with_frequency(s, freq):
    count = Counter(s)
    result = [char * freq for char in count if count[char] == freq]
    print(f"Substrings with frequency {freq}: {', '.join(result) if result else 'None'}")
substrings_with_frequency('aabbbccccddddd', 3)