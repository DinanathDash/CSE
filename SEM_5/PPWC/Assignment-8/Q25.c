#include <stdio.h>
#include <unistd.h>
#include <sys/wait.h>
int main() {
    pid_t pid1, pid2, pid3;
    printf("Parent Process ID: %d\n", getpid());
    pid1 = fork();
    if (pid1 == 0) {
        printf("Child 1: PID = %d, Parent PID = %d\n", getpid(), getppid());
    } else {
        pid2 = fork();
        if (pid2 == 0) {
            printf("Child 2: PID = %d, Parent PID = %d\n", getpid(), getppid());
        } else {
            pid3 = fork();
            if (pid3 == 0) {
                printf("Child 3: PID = %d, Parent PID = %d\n", getpid(), getppid());
            } else {
                wait(NULL);
                wait(NULL);
                wait(NULL);
                printf("Parent Done: PID = %d\n", getpid());
            }
        }
    }
    return 0;
}