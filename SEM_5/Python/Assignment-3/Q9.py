def binary_to_decimal(binary):
    return int(binary, 2)
binary_num = "1010"
decimal_num = binary_to_decimal(binary_num)
print(f"Binary {binary_num} to Decimal is {decimal_num}")

def decimal_to_binary(decimal):
    return bin(decimal)[2:]
decimal_num = 10
binary_num = decimal_to_binary(decimal_num)
print(f"Decimal {decimal_num} to Binary is {binary_num}")