#include <stdio.h>
#include <stdlib.h>
#include <unistd.h>
#include <sys/wait.h>

// Function to check if a number is prime
int is_prime(int num) {
    if (num <= 1) return 0;
    for (int i = 2; i * i <= num; i++) {
        if (num % i == 0) return 0;
    }
    return 1;
}

// Function to generate Fibonacci series
void generate_fibonacci(int *fib, int length) {
    fib[0] = 0;
    fib[1] = 1;
    for (int i = 2; i < length; i++) {
        fib[i] = fib[i - 1] + fib[i - 2];
    }
}

int main() {
    int length;
    printf("Enter the length of the Fibonacci series: ");
    scanf("%d", &length);

    if (length < 2) {
        printf("Length should be at least 2.\n");
        return 1;
    }

    int fib[length];
    pid_t pid = fork();

    if (pid == 0) {
        // Child Process: Generate Fibonacci series
        generate_fibonacci(fib, length);
        printf("Child Process: Fibonacci series generated.\n");
        exit(0);
    } else if (pid > 0) {
        // Parent Process: Wait for child to complete
        wait(NULL);
        printf("Parent Process: Fibonacci series:\n");
        generate_fibonacci(fib, length);

        for (int i = 0; i < length; i++) {
            printf("%d ", fib[i]);
        }
        printf("\n");

        // Identify and display prime Fibonacci numbers
        printf("Parent Process: Prime Fibonacci numbers:\n");
        for (int i = 0; i < length; i++) {
            if (is_prime(fib[i])) {
                printf("Prime: %d at position %d\n", fib[i], i);
            }
        }
    } else {
        perror("Fork failed");
        return 1;
    }

    return 0;
}

