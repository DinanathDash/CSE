def arithmetic_progression(first_term, common_difference):
    for i in range(10):
        current_term = first_term + i * common_difference
        print(current_term, end=" ")
first_term = int(input("Enter the first term of the AP: "))
common_difference = int(input("Enter the common difference: "))
print("The first 10 terms of the arithmetic progression are:")
arithmetic_progression(first_term, common_difference)
