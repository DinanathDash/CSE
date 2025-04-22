def ap(first_term, com_diff):
    for i in range(10):
        curr_term = first_term + i * com_diff
        print(curr_term, end=" ")
first_term = int(input("Enter the first term of the AP: "))
com_diff = int(input("Enter the common difference: "))
print("The first 10 terms of the arithmetic progression are:")
ap(first_term, com_diff)