def column_sum(matrix, col_index):
    return sum(row[col_index] for row in matrix)
print("Enter a 3-by-4 matrix row by row:")
matrix = []
for i in range(3):
    row = list(map(float, input(f"Row {i + 1}: ").split()))
    matrix.append(row)
print("Sum of each column:")
for col in range(4):
    print(f"Column {col + 1}: {column_sum(matrix, col)}")