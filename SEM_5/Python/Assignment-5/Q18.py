def analyze_list2(list1, list2):
    # Step 1: Convert lists to sets
    set1 = set(list1)
    set2 = set(list2)
    
    # Step 2: Find the symmetric difference between set1 and set2
    sym_diff = set1 ^ set2
    
    # Step 3: Modify each element in the symmetric difference
    modified_elements = []
    for element in sym_diff:
        if element % 2 == 0:  # Even number
            modified_elements.append(element * 2)
        else:  # Odd number
            modified_elements.append(element + 5)
    
    # Step 4: Return a sorted list of the modified elements
    return sorted(modified_elements)

# Example usage:
list1 = [1, 2, 3, 4, 5]
list2 = [2, 3, 6, 7, 8]
result = analyze_list2(list1, list2)
print(result)