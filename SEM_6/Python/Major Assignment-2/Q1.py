def recursive_sum(n):
    if n == 1:
        return 1
    return n + recursive_sum(n - 1)

def iterative_sum(n):
    total = 0
    for i in range(1, n + 1):
        total += i
    return total

def josephus(n, k):
    if n == 1:
        return 0
    return (josephus(n - 1, k) + k) % n

def iterative_josephus(n, k):
    result = 0
    for i in range(2, n + 1):
        result = (result + k) % i
    return result

def fast_power(a, b):
    if b == 0:
        return 1
    if b % 2 == 0:
        half = fast_power(a, b // 2)
        return half * half
    return a * fast_power(a, b - 1)

def iterative_fast_power(a, b):
    result = 1
    while b > 0:
        if b % 2 == 1:
            result *= a
        a *= a
        b //= 2
    return result

def linear_search(transactions, threshold):
    return [t for t in transactions if t > threshold]

def selection_sort(arr):
    for i in range(len(arr)):
        min_idx = i
        for j in range(i + 1, len(arr)):
            if arr[j] < arr[min_idx]:
                min_idx = j
        arr[i], arr[min_idx] = arr[min_idx], arr[i]
    return arr

def binary_search(arr, target):
    left, right = 0, len(arr) - 1
    while left <= right:
        mid = (left + right) // 2
        if arr[mid] == target:
            return True
        elif arr[mid] < target:
            left = mid + 1
        else:
            right = mid - 1
    return False

def merge_sort(arr):
    if len(arr) <= 1:
        return arr
    mid = len(arr) // 2
    left = merge_sort(arr[:mid])
    right = merge_sort(arr[mid:])
    
    sorted_arr = []
    i = j = 0
    while i < len(left) and j < len(right):
        if left[i] < right[j]:
            sorted_arr.append(left[i])
            i += 1
        else:
            sorted_arr.append(right[j])
            j += 1
    sorted_arr.extend(left[i:])
    sorted_arr.extend(right[j:])
    return sorted_arr

if __name__ == "__main__":
    print("Recursive Sum of 10:", recursive_sum(10))
    print("Iterative Sum of 10:", iterative_sum(10))

    n, k = 7, 3
    print(f"Josephus position (recursive) for n={n}, k={k}:", josephus(n, k))
    print(f"Josephus position (iterative) for n={n}, k={k}:", iterative_josephus(n, k))

    print("Fast Power (Recursive) 2^10:", fast_power(2, 10))
    print("Fast Power (Iterative) 2^10:", iterative_fast_power(2, 10))

    transactions = [120, 45, 300, 220, 90, 600, 130, 75, 800, 500, 350, 40]
    threshold = 250
    suspicious_transactions = linear_search(transactions, threshold)
    print("Suspicious Transactions:", suspicious_transactions)

    sorted_transactions = selection_sort(suspicious_transactions)
    print("Sorted Suspicious Transactions:", sorted_transactions)

    search_amount = 500
    print(f"Is {search_amount} in the list?", binary_search(sorted_transactions, search_amount))

    sorted_all_transactions = merge_sort(transactions)
    print("Sorted All Transactions:", sorted_all_transactions)
