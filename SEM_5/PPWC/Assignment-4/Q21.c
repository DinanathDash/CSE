#include <stdio.h>
void arrange(int *a, int *b);
int main() {
    int n1, n2, n3, n4, n5, n6;
    int *arr[] = {&n1, &n2, &n3, &n4, &n5, &n6};
    printf("Enter SIX numbers separated by blanks> ");
    scanf("%d %d %d %d %d %d", &n1, &n2, &n3, &n4, &n5, &n6);
    for (int i = 0; i < 5; i++) {
        for (int j = 0; j < 5 - i; j++) {
            arrange(arr[j], arr[j + 1]);
        }
    }
    printf("The numbers in ascending order are: %d %d %d %d %d %d\n", n1, n2, n3, n4, n5, n6);
    return 0;
}
void arrange(int *a, int *b) {
    if (*a > *b) {
        int temp = *a;
        *a = *b;
        *b = temp;
    }
}