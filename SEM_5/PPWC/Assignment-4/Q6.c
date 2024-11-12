#include <stdio.h>
int main() {
    int a = 12, b = 52, c = 8, *ptr1 = &a, *ptr2 = &b, *ptr3 = &c;
    *ptr1 += 10;
    *ptr2 += 10;
    *ptr3 += 10;
    printf("Updated value of a: %d\n", a);
    printf("Updated value of b: %d\n", b);
    printf("Updated value of c: %d\n", c);
    return 0;
}