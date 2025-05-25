def partition(arr, low, high):
    pivot = arr[low]
    left = low + 1
    right = high
    while True:
        while left <= right and arr[left] <= pivot:
            left += 1
        while left <= right and arr[right] > pivot:
            right -= 1
        if left <= right:
            arr[left], arr[right] = arr[right], arr[left]
        else:
            break
    arr[low], arr[right] = arr[right], arr[low]
    return right

def quick_sort_helper(arr, low, high):
    if low < high:
        pivot_index = partition(arr, low, high)
        quick_sort_helper(arr, low, pivot_index - 1)
        quick_sort_helper(arr, pivot_index + 1, high)

def quick_sort(arr):
    quick_sort_helper(arr, 0, len(arr) - 1)

arr = [37, 2, 6, 4, 89, 8, 10, 12, 68, 45]
quick_sort(arr)
print("Sorted array:", arr)