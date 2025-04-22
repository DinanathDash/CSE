#include <stdio.h>
#include <stdlib.h>
#include <unistd.h>
#include <sys/types.h>
#include <sys/wait.h>

int main() {
    pid_t pid = fork();

    if (pid < 0) {
        perror("Fork failed");
        exit(1);
    } else if (pid == 0) {
        // Child process
        printf("Child: PID = %d\n", getpid());
        while (1) {
            ; // Infinite loop for tracing
        }
    } else {
        // Parent process
        printf("Parent: PID = %d\n", getpid());
        while (1) {
            ; // Infinite loop for tracing
        }
    }

    return 0;
}

