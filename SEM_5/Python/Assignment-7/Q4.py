def count_char(string, char):
    return string.count(char)
t = "hello world"
c = "o"
print(f"The character '{c}' occurs {count_char(t, c)} times in the string.")