#include <stdio.h>
#include <math.h>
double log_approximation(double x) {
    double sum = 0.0;
    double term;
    double fraction = (x - 1) / x;
    for (int n = 1; n <= 9; n++) {
        term = (1.0 / 2.0) * pow(fraction, n);
        sum += term;
    }
    return sum;
}

int main() {
    double x, result;
    printf("Enter the value of x (x > 0): ");
    scanf("%lf", &x);
    if (x <= 0) {
        printf("Invalid input! Please enter a value greater than 0.\n");
        return 1;
    }
    result = log_approximation(x);
    printf("Approximation of ln(%lf) using the first 9 terms of the series is: %lf\n", x, result);
    printf("Actual value of ln(%lf) is: %lf\n", x, log(x));

    return 0;
}
