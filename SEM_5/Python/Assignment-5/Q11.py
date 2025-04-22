def number_to_words(n):
    digit_to_word = {
        '0': 'Zero', '1': 'One', '2': 'Two', '3': 'Three',
        '4': 'Four', '5': 'Five', '6': 'Six', '7': 'Seven',
        '8': 'Eight', '9': 'Nine'
    }
    n_str = str(n)
    words = [digit_to_word[digit] for digit in n_str if digit in digit_to_word]
    return ' '.join(words)
n = int(input("Enter a number: "))
print(number_to_words(n))