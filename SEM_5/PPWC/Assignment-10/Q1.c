#include <stdio.h>
#include <stdlib.h>
#include <unistd.h>
#include <sys/wait.h>
int shrd = 0;
void process1() {
    int x;
    x = shrd;
    x = x + 1;
    sleep(1);
    shrd = x;
    printf("P1: shrd = %d\n", shrd);
}
void process2() {
    int y;
    y = shrd;
    y = y - 1;
    sleep(1);
    shrd = y;
    printf("P2: shrd = %d\n", shrd);
}
int main() {
    pid_t pid1, pid2;
    shrd = 5;
    pid1 = fork();
    if (pid1 < 0) {
        perror("Fork failed");
        exit(1);
    }
    if (pid1 == 0) {
        process1();
        exit(0);
    } else {
        pid2 = fork();
        if (pid2 < 0) {
            perror("Fork failed");
            exit(1);
        }
        if (pid2 == 0) {
            process2();
            exit(0);
        }
    }
    wait(NULL);
    wait(NULL);
    printf("Final value of shrd = %d\n", shrd);
    return 0;
}