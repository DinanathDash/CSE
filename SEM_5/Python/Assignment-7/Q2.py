def are_anagrams(str1, str2):
    str1, str2 = str1.replace(" ", "").lower(), str2.replace(" ", "").lower()
    return sorted(str1) == sorted(str2)
print(are_anagrams("listen", "silent"))
print(are_anagrams("hello", "world"))