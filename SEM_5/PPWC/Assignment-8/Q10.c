#include <stdio.h>
#include <unistd.h>
int main(){
    int pid,pid2;
    pid=fork();
    if(pid){
        pid2=fork();
        printf("I\n");
    } else{
        printf("C\n");
        pid2=fork();
    }
    return 0;
}