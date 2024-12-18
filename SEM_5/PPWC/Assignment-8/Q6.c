#include <stdio.h>
#include <unistd.h>
int main(){
    fork();
    fork() + fork();
    fork();
    printf("doing!\n");
    return 0;
}