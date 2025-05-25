def merge_sorted_lists(list1, list2):
    merged_list = []
    i = j = 0
    while i < len(list1) and j < len(list2):
        if list1[i] < list2[j]:
            merged_list.append(list1[i])
            i += 1
        else:
            merged_list.append(list2[j])
            j += 1
    merged_list.extend(list1[i:])
    merged_list.extend(list2[j:])
    return merged_list

list1 = [1, 3, 5, 7]
list2 = [2, 4, 6, 8]
sorted_merged_list = merge_sorted_lists(list1, list2)
print(sorted_merged_list)