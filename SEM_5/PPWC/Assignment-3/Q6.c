#include <stdio.h>
int existsInArray(int arr[], int size, int element) {
    for (int i = 0; i < size; i++) {
        if (arr[i] == element) {
            return 1;
        }
    }
    return 0;
}
void difference(int p[], int size_p, int q[], int size_q) {
    printf("Difference (p - q): ");
    for (int i = 0; i < size_p; i++) {
        if (!existsInArray(q, size_q, p[i])) {
            printf("%d ", p[i]);
        }
    }
    printf("\n");
}
int main() {
    int p[] = {1, 2, 3, 4};
    int q[] = {2, 4, 5, 6};
    int size_p = sizeof(p) / sizeof(p[0]);
    int size_q = sizeof(q) / sizeof(q[0]);
    difference(p, size_p, q, size_q);
    return 0;
}