#include <stdio.h>
int main() {
    int a = 2, b = 3, c = 4;
    printf("Product: %d\n", a * b * c);
    return 0;
}

#include <stdio.h>
#include <unistd.h>
#include <sys/wait.h>
int main() {
    pid_t pid = fork();
    if (pid == 0) {
        execl("./MulThree", "MulThree", NULL);
    } else {
        int status;
        wait(&status);
        printf("Child Process PID: %d, Exit Status: %d\n", pid, WEXITSTATUS(status));
    }
    return 0;
}