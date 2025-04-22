#include <stdio.h>
#include <string.h>
void countChar(char str[]) {
    int ascii[256] = {0};
    for (int i = 0; str[i] != '\0'; i++) {
        ascii[(int)str[i]]++;
    }
    printf("The count of each character in the string \"%s\" is:\n", str);
    for (int i = 0; i < 256; i++) {
        if (ascii[i] > 0) {
            printf("%c-%d ", i, ascii[i]);
        }
    }
    printf("\n");
}
int main() {
    char str[] = "bintu";
    countChar(str);
    return 0;
}