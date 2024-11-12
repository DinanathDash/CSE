#include <stdio.h>
#include <stdlib.h>
int main() {
    int *arr[4];
    int *maxvar = (int *)malloc(sizeof(int));
    arr[0] = (int *)malloc(sizeof(int));
    arr[1] = (int *)malloc(sizeof(int));
    arr[2] = (int *)malloc(sizeof(int));
    arr[3] = (int *)malloc(sizeof(int));
    *arr[0] = 55;
    *arr[1] = 105;
    *arr[2] = 89;
    *arr[3] = 68;
    *maxvar = *arr[0];
    for (int i = 1; i < 4; i++) {
        if (*arr[i] > *maxvar) {
            *maxvar = *arr[i];
        }
    }
    printf("Maximum value is: %d\n", *maxvar);
    for (int i = 0; i < 4; i++) {
        free(arr[i]);
    }
    free(maxvar);
    return 0;
}