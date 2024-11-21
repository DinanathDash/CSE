#include <stdio.h>
void sum_n_avg(double n1, double n2, double n3, double *sump, double *avgp) {
    *sump = n1 + n2 + n3;
    *avgp = *sump / 3.0;
}
int main() {
    double one, two, three, sum_of_3, avg_of_3;
    printf("Enter three numbers> ");
    scanf("%lf %lf %lf", &one, &two, &three);
    sum_n_avg(one, two, three, &sum_of_3, &avg_of_3);
    printf("Sum = %.2lf, Average = %.2lf\n", sum_of_3, avg_of_3);
    return 0;
}