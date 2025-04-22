l = [(1, 2), (3, 4, 5), (6,), (7, 8, 9, 10), (11, 12)]
K = int(input("Enter the length of tuples to remove: "))
f_list = [t for t in l if len(t) != K]
print("Original list:", l)
print("Filtered list (removed tuples of length", K, "):", f_list)