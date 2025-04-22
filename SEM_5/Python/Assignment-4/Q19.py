import copy
l = [['Shallow', 2, 3], [4, 5, 6]]
print("Original List:", l)
shallow_copy = copy.copy(l)
deep_copy = copy.deepcopy(l)
l[0][0] = 'Changed'
print("After modifying the original list:")
print("Original List:", l)
print("Shallow Copy:", shallow_copy)
print("Deep Copy:", deep_copy)