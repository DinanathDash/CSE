def findnum():
    result = []
    for num in range(100, 501):
        if num % 3 == 0 and num % 5 == 0:
            result.append(num)
    return result
print(findnum())