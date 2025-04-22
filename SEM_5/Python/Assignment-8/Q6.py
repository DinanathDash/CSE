import csv
header = ['FirstName', 'LastName', 'Exam1Grade', 'Exam2Grade', 'Exam3Grade']
with open('grades.csv', 'a', newline='') as file:
    writer = csv.writer(file)
    if file.tell() == 0:
        writer.writerow(header)
    while True:
        first_name = input("Enter the student's first name (or type 'exit' to quit): ")
        if first_name.lower() == 'exit':
            break
        last_name = input("Enter the student's last name: ")
        exam1_grade = int(input("Enter the grade for Exam 1: "))
        exam2_grade = int(input("Enter the grade for Exam 2: "))
        exam3_grade = int(input("Enter the grade for Exam 3: "))
        writer.writerow([first_name, last_name, exam1_grade, exam2_grade, exam3_grade])
        print("Student data saved successfully.\n")
print("Data entry complete.")