def roman_to_integer(roman):
    roman_values = {
        'I': 1, 'V': 5, 'X': 10, 'L': 50, 'C': 100, 'D': 500, 'M': 1000
    }
    total = 0
    for i in range(len(roman)):
        current_value = roman_values[roman[i]]
        if i + 1 < len(roman) and roman_values[roman[i + 1]] > current_value:
            total -= current_value
        else:
            total += current_value
    return total
roman_numeral = input("Enter a Roman numeral: ")
integer_value = roman_to_integer(roman_numeral)
print(f"The integer value of {roman_numeral} is {integer_value}")