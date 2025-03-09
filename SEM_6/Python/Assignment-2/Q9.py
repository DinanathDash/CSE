people = [
    ("Elon Musk", 433.9),
    ("Jeff Bezos", 239.4),
    ("Mark Zuckerberg", 211.8),
    ("Larry Ellison", 204.6),
    ("Bernard Arnault & Family", 181.3),
    ("Larry Page", 161.4),
]

def selection_sort(arr):
    n = len(arr)
    for i in range(n):
        min_idx = i
        for j in range(i + 1, n):
            if arr[j][1] < arr[min_idx][1]:
                min_idx = j
        arr[i], arr[min_idx] = arr[min_idx], arr[i]

def bubble_sort(arr):
    n = len(arr)
    for i in range(n):
        swapped = False
        for j in range(n - 1 - i):
            if arr[j][1] > arr[j + 1][1]:
                arr[j], arr[j + 1] = arr[j + 1], arr[j]
                swapped = True
        if not swapped:
            break

def insertion_sort(arr):
    n = len(arr)
    for i in range(1, n):
        key = arr[i]
        j = i - 1
        while j >= 0 and arr[j][1] > key[1]:
            arr[j + 1] = arr[j]
            j -= 1
        arr[j + 1] = key

people_selection = people.copy()
people_bubble = people.copy()
people_insertion = people.copy()
selection_sort(people_selection)
bubble_sort(people_bubble)
insertion_sort(people_insertion)
sorted_dict = {name: networth for name, networth in people_selection}
print("Sorted Net Worths:", sorted_dict)