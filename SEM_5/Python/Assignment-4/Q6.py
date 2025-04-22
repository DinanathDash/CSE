n = [int(input(f"Enter integer {i+1}: ")) for i in range(10)]
num = int(input("Enter the number to search for: "))
count = n.count(num)
if count > 0:
    print(f"The number {num} appears {count} time(s) in the list.")
else:
    print(f"The number {num} is not in the list.")