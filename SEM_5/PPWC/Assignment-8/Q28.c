#include <stdio.h>
#include <unistd.h>
#include <stdlib.h>
void generateFibonacci(int n) {
    int a = 0, b = 1, c;
    printf("Fibonacci Series: %d %d ", a, b);
    for (int i = 2; i < n; i++) {
        c = a + b;
        printf("%d ", c);
        a = b;
        b = c;
    }
    printf("\n");
}
int main(int argc, char *argv[]) {
    if (argc != 2) {
        printf("Usage: %s <number_of_terms>\n", argv[0]);
        return 1;
    }
    int n = atoi(argv[1]);
    pid_t pid = fork();
    if (pid == 0) {
        generateFibonacci(n);
    } else {
        wait(NULL);
    }
    return 0;
}