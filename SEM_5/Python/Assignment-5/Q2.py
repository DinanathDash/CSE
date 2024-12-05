s_d = {}
n = int(input("Enter the number of students: "))
for _ in range(n):
    name = input("Enter the student's name: ")
    p = float(input(f"Enter {name}'s percentage of marks: "))
    s_d[name] = p
print("\nStudent Information:")
for name, p in s_d.items():
    print(f"Name: {name}, Percentage: {p}%")