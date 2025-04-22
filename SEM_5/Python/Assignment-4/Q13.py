def sort(tuple_list):
    return sorted(tuple_list, key=lambda x: x[1])
l = [(1, 3), (4, 1), (5, 2), (2, 4)]
print("Sorted list:", sort(l))