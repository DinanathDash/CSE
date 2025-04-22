import random
def partition(arr, left, right, pivot_index):
    pivot_value = arr[pivot_index]
    arr[pivot_index], arr[right] = arr[right], arr[pivot_index]
    store_index = left
    for i in range(left, right):
        if arr[i] > pivot_value:
            arr[i], arr[store_index] = arr[store_index], arr[i]
            store_index += 1
    arr[store_index], arr[right] = arr[right], arr[store_index]
    return store_index

def quickselect(arr, left, right, k):
    if left == right:
        return arr[left]
    pivot_index = random.randint(left, right)
    pivot_index = partition(arr, left, right, pivot_index)
    if k == pivot_index:
        return arr[k]
    elif k < pivot_index:
        return quickselect(arr, left, pivot_index - 1, k)
    else:
        return quickselect(arr, pivot_index + 1, right, k)

def kth_largest(arr, k):
    return quickselect(arr, 0, len(arr) - 1, k - 1)

arr = [3, 2, 1, 5, 6, 4]
k = int(input("Enter k: "))
print(f"{k}-th largest element is:", kth_largest(arr, k))