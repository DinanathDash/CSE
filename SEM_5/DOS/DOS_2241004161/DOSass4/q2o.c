#include <stdio.h>
#include <unistd.h>

int main() {
    int i = 5;
    if (fork() == 0) {
        i = i + 1;
    } else {
        i = i - 1;
    }
    printf("%d\n", i);
    return 0;
}

