score = int(input("Enter the student's score (0-100): "))
if 90 <= score <= 100:
    grade = 'A'
    comment = 'Excellent'
elif 80 <= score < 90:
    grade = 'B'
    comment = 'Good'
elif 70 <= score < 80:
    grade = 'C'
    comment = 'Average'
elif 60 <= score < 70:
    grade = 'D'
    comment = 'Needs Improvement'
else:
    grade = 'F'
    comment = 'Failing'
print(f"Grade: {grade}")
print(f"Comment: {comment}")
