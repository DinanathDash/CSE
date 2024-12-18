#include <stdio.h>
#include <unistd.h>
int main(){
    fork();
    fork() && fork();
    fork();
    printf("Got!!!\n");
    return 0;
}