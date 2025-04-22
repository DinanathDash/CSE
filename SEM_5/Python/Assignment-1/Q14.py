# Case a
a, b, c = 10, 5, 0
result_a = (a < b) or (not(c == b) and (c < a))
print(result_a)

# Case b
a, b, c = 1.21, 1.20, 1.22
result_b = (a < b) or (not(c == b) and (c < a))
print(result_b)