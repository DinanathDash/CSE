#include <stdio.h>
void multiplication_table(int n) {
    printf("+--------------------------------------------------+\n|");
    for (int i = 1; i <= 10; i++) {
        printf(" %4d", n * i);
    }
    printf("|\n|");
    for (int i = 1; i <= 10; i++) {
        printf(" %4d", i);
    }
    printf("|\n|");
    for (int i = 1; i <= 10; i++) {
        printf(" %4d", n);
    }
    printf("|\n");
    printf("+--------------------------------------------------+\n");
}

int main() {
    int num;
    printf("Enter the number > ");
    scanf("%d", &num);
    multiplication_table(num);
    return 0;
}
