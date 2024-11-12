#include <stdio.h>
int main() {
    float x = 89.0, *p1 = &x, *p2 = &x, *p3 = &x;
    printf("Value of x from p1: %.1f\n", *p1);
    *p3 = 100.0;
    printf("Updated value of x from p3: %.1f\n", *p3);
    return 0;
}