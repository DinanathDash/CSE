import random
def matrix():
    return [[random.randint(0, 1) for _ in range(4)] for _ in range(4)]
def find_larg(matrix):
    row_c = [sum(row) for row in matrix]
    col_c = [sum(matrix[i][j] for i in range(4)) for j in range(4)]
    row_ind = row_c.index(max(row_c))
    col_ind = col_c.index(max(col_c))
    return row_ind, col_ind
print("Matrix:")
for row in matrix():
    print("".join(map(str, row)))
r_index, c_index = find_larg(matrix())
print(f"The largest row index: {r_index}")
print(f"The largest column index: {c_index}")