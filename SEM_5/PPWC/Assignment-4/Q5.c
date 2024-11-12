#include <stdio.h>
int main() {
    int a = 12, b = 25, c = 18, *ptr;
    ptr = &a;
    *ptr += 10;
    ptr = &b;
    *ptr += 10;
    ptr = &c;
    *ptr += 10;
    printf("Updated value of a: %d\n", a);
    printf("Updated value of b: %d\n", b);
    printf("Updated value of c: %d\n", c);
    return 0;
}