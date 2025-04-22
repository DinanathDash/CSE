def check_symmetric(string):
    string = string.strip().lower()
    if string == string[::-1]:
        return "Symmetric"
    else:
        return "Asymmetric"
s = input("Enter a string: ")
result = check_symmetric(s)
print(f"The string is {result}.")