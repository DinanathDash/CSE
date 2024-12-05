s = input("Enter a string: ")
c = {char: s.count(char) for char in set(s)}
print("Occurrences of each letter:", c)