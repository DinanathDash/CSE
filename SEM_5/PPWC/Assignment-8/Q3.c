#include <unistd.h>
#include <stdio.h>
int main(void){
    printf("A");
    fork();
    printf("P\n");
    return 0;
}