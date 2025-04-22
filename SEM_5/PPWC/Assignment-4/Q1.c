#include <stdio.h>
int main() {
    int Ia = 345;
    float Fb = 45.0;
    char Chvar = 'Z';
    printf("Value and address of Ia is %d and %p respectively\n", Ia, &Ia);
    printf("Value and address of Fb is %.2f and %p respectively\n", Fb, &Fb);
    printf("Value and address of Chvar is %c and %p respectively\n", Chvar, &Chvar);
    return 0;
}