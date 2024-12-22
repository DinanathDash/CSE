import re
def validate_password(password):
    pattern = r'^(?=.*[A-Z])(?=.*[a-z])(?=.*\d)(?=.*[!@#$%&*?]).{8,}$'
    if re.match(pattern, password):
        return "Password is secure"
    else:
        return "Password is not secure"
password = input("Enter a password: ")
result = validate_password(password)
print(result)