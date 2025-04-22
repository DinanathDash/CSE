#include<stdio.h>
int main() {
    int a, b, c;
    printf("Enter in decimal format:");
    scanf("%d", &a);
    printf("Enter in octal format: ");
    scanf("%d", &b);
    printf("Enter in hexadecimal format: ");
    scanf("%d", &c);
    printf("a = %d, b = %d, c = %d", a, b, c);
    printf("Enter in decimal format:");
    scanf("%i", &b);
    printf("Enter in octal format: ");
    scanf("%i", &b);
    printf("Enter in hexadecimal format: ");
    scanf("%i", &c);
    printf("a = %i, b = %i, c = %i\n", a, b, c);
    return 0;
}
