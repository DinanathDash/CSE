#include <stdio.h>
int main() {
    int a[] = {120, 502, 118, 188, 106, 447};
    int *ptr = a;
    printf("Array content using the pointer:\n");
    for (int i = 0; i < 6; i++) {
        printf("a[%d] = %d, Address: %p\n", i, *(ptr + i), (ptr + i));
    }
    return 0;
}