s = input("Enter a string: ")
vowels = 'aeiou'
c = {vowel: 0 for vowel in vowels}
for char in s.lower():
    if char in vowels:
        c[char] += 1
print("Vowels and their occurrences:")
for vowel, count in c.items():
    if count > 0:
        print(f"{vowel}: {count}")