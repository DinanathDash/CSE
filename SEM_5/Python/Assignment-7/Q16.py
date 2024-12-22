def extract_unique_sorted(s):
    unique_chars = set(s)
    sorted_chars = sorted(unique_chars)
    return ''.join(sorted_chars)
string = "programming"
result = extract_unique_sorted(string)
print(f"Unique characters in sorted order: {result}")