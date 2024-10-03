#include <stdio.h>

int main() {
    char des_grade;
    float min_avg, cur_avg, final_weight, final_score_needed;

    printf("Enter desired grade> ");
    scanf(" %c", &des_grade);

    printf("Enter minimum average required> ");
    scanf("%f", &min_avg);

    printf("Enter current average in course> ");
    scanf("%f", &cur_avg);

    printf("Enter how much the final counts as a percentage of the course grade> ");
    scanf("%f", &final_weight);

    final_score_needed = (min_avg - cur_avg * (1 - final_weight / 100)) / (final_weight / 100);

    printf("You need a score of %.2f on the final to get a %c.\n", final_score_needed, des_grade);

    return 0;
}
