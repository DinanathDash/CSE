s_m = {}
n = int(input("Enter the number of students: "))
for _ in range(n):
    name = input("Enter the student's name: ")
    m = float(input(f"Enter marks for {name}: "))
    s_m[name] = m
while True:
    s_name = input("Enter the student's name to fetch marks (or type 'exit' to quit): ")
    if s_name.lower() == 'exit':
        print("Exiting the program.")
        break
    if s_name in s_m:
        print(f"{s_name}'s marks: {s_m[s_name]}")
    else:
        print(f"No record found for {s_name}.")