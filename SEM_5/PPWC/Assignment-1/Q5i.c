#include<stdio.h>
int main() {
    double x = 3000.0, y = 0.0035;
    printf("%f %f %f\n", x, y, x*y, x/y);
    printf("%e %e %e\n", x, y, x*y, x/y);
    printf("%E %E %E\n", x, y, x*y, x/y);
    return 0;
}
