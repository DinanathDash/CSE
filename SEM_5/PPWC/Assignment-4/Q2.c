#include <stdio.h>
int main() {
    int a = 10, b = 20;
    printf("Before swap:\n");
    printf("Value of a: %d, Address of a: %p\n", a, &a);
    printf("Value of b: %d, Address of b: %p\n", b, &b);
    int temp = a;
    a = b;
    b = temp;
    printf("\nAfter swap:\n");
    printf("Value of a: %d, Address of a: %p\n", a, &a);
    printf("Value of b: %d, Address of b: %p\n", b, &b);
    return 0;
}