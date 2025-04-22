#include <stdio.h>
#include <unistd.h>
int main(){
    pid_t childpid;
    int i, n=3;
    for (i = 1; i < n; i++) {
        childpid=fork();
        if(childpid == -1)
            break;
    }
    printf("i:%d\n",i);
    return 0;
}