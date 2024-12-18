#include <stdio.h>
#include <unistd.h>
int main(void){
    if(fork()==0)
        printf("1\n");
    else if(fork()==0)
        printf("2\n");
    else if(fork()==0)
        printf("3\n");
    else if(fork()==0)
        printf("4\n");
    else
        printf("5\n");
    return 0;
}