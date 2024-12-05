# Define the sets
A = {10, 20, 30}
B = {5, 10, 15, 20}

# a) {30} - Elements in A but not in B (Difference)
result_a = A - B
print(f"a) {result_a}")

# b) {5, 15, 30} - Elements in either A or B but not in both (Symmetric Difference)
result_b = A ^ B
print(f"b) {result_b}")

# c) {5, 10, 15, 20, 30} - All unique elements from both A and B (Union)
result_c = A | B
print(f"c) {result_c}")

# d) {10, 20} - Elements common to both A and B (Intersection)
result_d = A & B
print(f"d) {result_d}")