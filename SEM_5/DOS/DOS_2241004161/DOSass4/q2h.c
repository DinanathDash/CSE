#include <stdio.h>
#include <unistd.h>
#include <stdlib.h>

int main() {
    int i = 5;
    if (vfork() == 0) {
        printf("Child: %d\n", i);
        _exit(0);
    } else {
        printf("Parent: %d\n", i);
    }
    return 0;
}

