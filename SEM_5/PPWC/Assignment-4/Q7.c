#include <stdio.h>
int main() {
    int a = 52,  b = 18, *ptr1 = &a, *ptr2 = &b;
    if (*ptr1 > *ptr2) {
        printf("The greater value is: %d\n", *ptr1);
    } else {
        printf("The greater value is: %d\n", *ptr2);
    }
    return 0;
}