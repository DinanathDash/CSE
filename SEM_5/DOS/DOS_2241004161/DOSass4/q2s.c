#include <stdio.h>
#include <unistd.h>

int main() {
    if (fork() == 0) {
        if (fork()) {
            printf("1\n");
        }
    }
    return 0;
}

