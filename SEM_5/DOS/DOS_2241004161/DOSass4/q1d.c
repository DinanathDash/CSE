#include <stdio.h>
#include <unistd.h>
#include <sys/types.h>
#include <sys/wait.h>
#include <stdlib.h>

int main() {
    pid_t pid = fork();

    if (pid < 0) {
        // Fork failed
        perror("Fork failed");
        return 1;
    } else if (pid == 0) {
        // Child process
        printf("Child: PID = %d\n", getpid());
        sleep(5); // Simulate some work in the child process
        printf("Child: Completed task\n");
        exit(0);  // Child process terminates
    } else {
        // Parent process
        printf("Parent: PID = %d\n", getpid());
        wait(NULL); // Parent waits for the child process to complete
        printf("Parent: Child has completed\n");
    }
    return 0;
}

