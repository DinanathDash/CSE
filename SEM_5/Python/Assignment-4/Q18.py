n = list(map(int, input("Enter numbers separated by spaces: ").split()))
sq_num = [x ** 2 for x in n]
print("List of squares:", sq_num)