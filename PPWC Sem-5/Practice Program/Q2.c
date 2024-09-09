#include <stdio.h>

int main() {
    float tsp, tp, cpi;
    int n = 15;
    printf("Enter the total selling price of 15 items: ");
    scanf("%f", &tsp);
    printf("Enter the total profit earned on 15 items: ");
    scanf("%f", &tp);
    float tcp = tsp - tp;
    cpi = tcp / n;
    printf("The cost price of one item is: %.2f\n", cpi);
    return 0;
}
