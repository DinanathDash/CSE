#include <stdio.h>
#include <unistd.h>
#include <sys/wait.h>

int main() {
    if (fork() == 0) {
        printf("1");
    } else {
        wait(NULL);
        printf("2");
    }
    printf("3");
    return 0;
}

