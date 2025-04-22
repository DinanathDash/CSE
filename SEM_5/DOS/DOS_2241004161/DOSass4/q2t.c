#include <stdio.h>
#include <unistd.h>

void fun1() {
    fork();
    fork();
    printf("1\n");
}

int main() {
    fun1();
    printf("1\n");
    return 0;
}

