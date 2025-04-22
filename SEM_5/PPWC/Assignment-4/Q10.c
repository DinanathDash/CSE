#include <stdio.h>
int main() {
    int a[] = {120, 502, 118, 188, 106, 447}, *ptr1 = &a[0], *ptr2 = &a[1], *ptr3 = &a[2], *ptr4 = &a[3], *ptr5 = &a[4], *ptr6 = &a[5];
    printf("Array content using pointers:\n");
    printf("a[0] = %d, Address: %p\n", *ptr1, ptr1);
    printf("a[1] = %d, Address: %p\n", *ptr2, ptr2);
    printf("a[2] = %d, Address: %p\n", *ptr3, ptr3);
    printf("a[3] = %d, Address: %p\n", *ptr4, ptr4);
    printf("a[4] = %d, Address: %p\n", *ptr5, ptr5);
    printf("a[5] = %d, Address: %p\n", *ptr6, ptr6);
    return 0;
}