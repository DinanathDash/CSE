def print_table(matrix):
    for row in matrix:
        for element in row:
            print(f"{element}\t", end="")
        print()
M = int(input("Enter number of rows (M): "))
N = int(input("Enter number of columns (N): "))
matrix = []
for i in range(M):
    row = list(map(int, input(f"Enter {N} numbers for row {i + 1} (separated by spaces): ").split()))
    matrix.append(row)
print("Matrix in tabular format:")
print_table(matrix)