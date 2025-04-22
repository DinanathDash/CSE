#include <stdio.h>

int main() {
    float subject1, subject2, subject3, subject4, subject5;
    float aggregate, percentage;
    int total_subjects = 5;
    int max_marks_per_subject = 100;
    int max_total_marks = total_subjects * max_marks_per_subject;
    printf("Enter the marks obtained in subject 1: ");
    scanf("%f", &subject1);
    printf("Enter the marks obtained in subject 2: ");
    scanf("%f", &subject2);
    printf("Enter the marks obtained in subject 3: ");
    scanf("%f", &subject3);
    printf("Enter the marks obtained in subject 4: ");
    scanf("%f", &subject4);
    printf("Enter the marks obtained in subject 5: ");
    scanf("%f", &subject5);
    aggregate = subject1 + subject2 + subject3 + subject4 + subject5;
    percentage = (aggregate / max_total_marks) * 100;
    printf("Aggregate Marks: %.2f\n", aggregate);
    printf("Percentage Marks: %.2f%%\n", percentage);

    return 0;
}
