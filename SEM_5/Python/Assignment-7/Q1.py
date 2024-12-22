def replace(s):
    result = []
    for i in range(len(s)):
        if i > 0 and s[i] == s[i - 1]:
            result.append('*')
        else:
            result.append(s[i])
    return ''.join(result)
print(replace('balloon'))