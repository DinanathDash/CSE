from itertools import permutations
def unique_permutations(s):
    perm_set = set(permutations(s))
    unique_perm = [''.join(p) for p in perm_set]
    return unique_perm
input_string = "abc"
result = unique_permutations(input_string)
print("Unique permutations:", result)