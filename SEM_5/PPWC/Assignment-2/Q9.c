#include <stdio.h>
void printPattern(char choice) {
    int i, j, k;
    for (i = 0; i <= choice - 'A'; i++) {
        for (j = 0; j <= choice - 'A' - i; j++) {
            printf("%c ", 'A' + j);
        }
        for (k = 0; k < 2 * i - 1; k++) {
            printf("  ");
        }
        for (j = choice - 'A' - i; j >= 0; j--) {
            if (j != choice - 'A') {
                printf("%c ", 'A' + j);
            }
        }
        printf("\n");
    }
}
int main() {
    char choice;
    printf("Enter the choice of the character: ");
    scanf(" %c", &choice);
    printPattern(choice);
    return 0;
}
