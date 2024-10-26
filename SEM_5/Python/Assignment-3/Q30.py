def product_of_digits(n):
    product = 1
    for digit in str(n):
        product *= int(digit)
    return product
num = int(input("Enter a number: "))
print(f"The product of the digits of {num} is: {product_of_digits(num)}")
