# Define the sets
A = {'red', 'green', 'blue'}
B = {'cyan', 'green', 'blue', 'magenta', 'red'}

# a) Comparing the sets using comparison operators

# Check equality
print(f"a) A == B: {A == B}")

# Check inequality
print(f"a) A != B: {A != B}")

# Check if A is a proper subset of B
print(f"a) A < B: {A < B}")

# Check if A is a subset of B
print(f"a) A <= B: {A <= B}")

# Check if A is a proper superset of B
print(f"a) A > B: {A > B}")

# Check if A is a superset of B
print(f"a) A >= B: {A >= B}")

# b) Combining the sets using mathematical set operators

# Union
union_result = A | B
print(f"b) A | B (Union): {union_result}")

# Intersection
intersection_result = A & B
print(f"b) A & B (Intersection): {intersection_result}")

# Difference (A - B)
difference_result = A - B
print(f"b) A - B (Difference): {difference_result}")

# Symmetric Difference (A ^ B)
symmetric_difference_result = A ^ B
print(f"b) A ^ B (Symmetric Difference): {symmetric_difference_result}")