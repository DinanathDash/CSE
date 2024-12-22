from collections import Counter
def max_frequency_char(s):
    freq = Counter(s)
    max_char = max(freq, key=freq.get)
    return max_char, freq[max_char]
s = input("Enter a string: ")
char, frequency = max_frequency_char(s)
print(f"The character with the maximum frequency is '{char}' with a frequency of {frequency}.")