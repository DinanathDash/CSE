from itertools import permutations
def generate_three_letter_combinations(word):
    combinations = [''.join(p) for p in permutations(word, 3)]
    return combinations
word = input("Enter a five-letter word: ")
if len(word) == 5 and word.isalpha():
    result = generate_three_letter_combinations(word)
    print("Three-letter combinations:")
    print(result)
else:
    print("Please enter a valid five-letter word.")