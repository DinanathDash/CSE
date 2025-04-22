def rem(lst, elem):
    return [x for x in lst if x != elem]
l = [1, 2, 3, 4, 2, 5, 2]
elem = int(input("Enter the element to remove: "))
print("Updated list:", rem(l, elem))