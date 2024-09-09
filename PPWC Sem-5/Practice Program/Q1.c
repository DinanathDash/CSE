#include <stdio.h>
int main() {
    float p, y, r, i;
    printf("Enter the principal amount: ");
    scanf("%f", &p);
    printf("Enter the number of years: ");
    scanf("%f", &y);
    printf("Enter the rate of interest: ");
    scanf("%f", &r);
    i = (p*y*r)/((float)100);
    printf("The Simple Interest is: %.2f\n", i);
    return 0;
}
