#include <stdio.h>
int leap(int year) {
    if (year % 4 == 0) {
        if (year % 100 == 0) {
            if (year % 400 == 0) return 1;
            else return 0;
        } else return 1;
    }
    return 0;
}
int day_of_year(int day, int month, int year) {
    int days_in_month[] = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
    if (leap(year)) days_in_month[1] = 29;

    int day_number = 0;
    for (int i = 0; i < month - 1; i++) {
        day_number += days_in_month[i];
    }
    day_number += day;
    return day_number;
}

int main() {
    int day, month, year;
    printf("Enter day, month and year: ");
    scanf("%d %d %d", &day, &month, &year);
    int day_number = day_of_year(day, month, year);
    printf("The day number for %d-%d-%d is: %d\n", day, month, year, day_number);

    return 0;
}
