def sort(l):
    if l == sorted(l):
        return "The list is already sorted."
    else:
        return "The list is not sorted."
l = input("Enter list: ").split()
n = list(map(int, l))
print(sort(n))