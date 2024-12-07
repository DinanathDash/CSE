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
print(f"b) A | B (Union): {A | B}")

# Intersection
print(f"b) A & B (Intersection): {A & B}")

# Difference (A - B)
print(f"b) A - B (Difference): {A - B}")

# Symmetric Difference (A ^ B)
print(f"b) A ^ B (Symmetric Difference): {A ^ B}")