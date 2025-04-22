#include <stdio.h>
#include <unistd.h>
#include <sys/wait.h>
int main() {
    pid_t pid = fork();
    if (pid == 0) {
        execl("/bin/grep", "grep", "-n", "pattern", "filename", NULL);
    } else {
        int status;
        wait(&status);
        printf("Child Process PID: %d, Exit Status: %d\n", pid, WEXITSTATUS(status));
    }
    return 0;
}