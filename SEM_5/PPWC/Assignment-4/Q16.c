#include <stdio.h>
int main() {
    int a[3] = {1, 2, 3};
    int b[3] = {4, 5, 6};
    int c[3] = {7, 8, 9};
    int d[3] = {10, 11, 12};
    int *arr[4] = {a, b, c, d};
    int sumarr[3] = {0, 0, 0};
    printf("The element-wise sum of arrays a, b, c, and d is:\n");
    for (int i = 0; i < 3; i++) {
        sumarr[i] = *(arr[0] + i) + *(arr[1] + i) + *(arr[2] + i) + *(arr[3] + i);
        printf("sumarr[%d] = %d\n", i, sumarr[i]);
    }
    return 0;
}