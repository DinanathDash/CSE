#include <stdio.h>
#include <unistd.h>
int main(){
    fork()&&fork();
    fork()||fork();
    printf("Hi\n");
    return 0;
}