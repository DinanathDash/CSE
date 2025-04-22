#include <stdio.h>
int main() {
    int a = 55, b = 105, c = 89, d = 68;
    int *arr[4] = { &a, &b, &c, &d };
    int maxvar = *arr[0];
    for (int i = 1; i < 4; i++) {
        if (*arr[i] > maxvar) {
            maxvar = *arr[i];
        }
    }
    printf("The maximum value among a, b, c, and d is: %d\n", maxvar);
    return 0;
}