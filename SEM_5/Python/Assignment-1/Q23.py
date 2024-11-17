number = int(input("Enter a four-digit integer: "))
d1 = number // 1000
d2 = (number // 100) % 10
d3 = (number // 10) % 10
d4 = number % 10
digit_sum = d1 + d2 + d3 + d4
print("The sum of the digits is:", digit_sum)