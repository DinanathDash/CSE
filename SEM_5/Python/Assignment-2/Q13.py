pos = input("Enter the position (e.g., a1): ")
column = pos[0]
row = int(pos[1])
column_num = ord(column.lower()) - ord('a') + 1
if (column_num + row) % 2 == 0:
    print(f"The square {pos} is black.")
else:
    print(f"The square {pos} is white.")