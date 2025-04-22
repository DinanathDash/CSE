//a
#include <stdio.h>
#include <unistd.h>
void generateHierarchyA() {
    fork();
    fork();
    printf("PID: %d, Parent PID: %d\n", getpid(), getppid());
}
int main() {
    generateHierarchyA();
    return 0;
}

//b
#include <stdio.h>
#include <unistd.h>
void generateHierarchyB() {
    if (fork() == 0) {
        fork();
    }
    printf("PID: %d, Parent PID: %d\n", getpid(), getppid());
}
int main() {
    generateHierarchyB();
    return 0;
}