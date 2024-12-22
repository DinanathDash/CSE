def substrings_with_frequency(s, frequency):
    substrings = []
    current_char = None
    current_count = 0
    temp_substring = ""
    for char in s:
        if char == current_char:
            temp_substring += char
            current_count += 1
        else:
            if current_count == frequency:
                substrings.append(temp_substring)
            current_char = char
            current_count = 1
            temp_substring = char
    if current_count == frequency:
        substrings.append(temp_substring)

    return substrings
string = "aabbbccccddddd"
freq = 3
result = substrings_with_frequency(string, freq)
print(f"Substrings with frequency {freq}: {result}")