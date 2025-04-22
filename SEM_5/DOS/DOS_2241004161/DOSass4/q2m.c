#include <stdio.h>
#include <unistd.h>

int main() {
    int i = 5;
    fork();
    i = i + 1;
    fork();
    printf("%d\n", i);
    return 0;
}

