#include <unistd.h>
#include <stdio.h>
int main(void){
    printf("hello\n");
    fork();
    printf("hello\n");
    fork();
    printf("hello\n");
    fork();
    printf("hello\n");
    return 0;
}