#include <stdio.h>
#include <string.h>
void findFirstRepetitiveChar(char str[]) {
    int ascii[256] = {0};
    for (int i = 0; str[i] != '\0'; i++) {
        char ch = str[i];
        if (ascii[(int)ch] == 1) {
            printf("The first repetitive character in the string \"%s\" is '%c'.\n", str, ch);
            return;
        }
        ascii[(int)ch] = 1;
    }
    printf("There are no repetitive characters in the string \"%s\".\n", str);
}
int main() {
    char str[] = "racecar";
    findFirstRepetitiveChar(str);
    return 0;
}