#include <stdio.h>
int main() {
    char *argv[] = {"mine", "cs", "sc", "soa", NULL};
    for (int i = 0; argv[i] != NULL; i++) {
        for (char *p = argv[i]; *p != '\0'; p++) {
            if (*p >= 'a' && *p <= 'z'){
                *p = *p - ('a' - 'A');
            }
        }
    }
    for (int i = 0; argv[i] != NULL; i++) {
        printf("%s\n", argv[i]);
    }
    return 0;
}