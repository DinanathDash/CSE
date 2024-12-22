total = 0
count = 0
grades = []
with open('grades.txt', 'r') as file:
    for line in file:
        grade = float(line.strip())
        grades.append(grade)
        total += grade
        count += 1
print("Grades:")
for grade in grades:
    print(grade)
if count > 0:
    average = total / count
    print("\nTotal:", total)
    print("Count:", count)
    print("Average:", average)
else:
    print("No grades found in the file.")