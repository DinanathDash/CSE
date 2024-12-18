#include <stdio.h>
#include <unistd.h>
int main(){
    int x[] = {10, 20, fork(), fork()+fork()};
    int len = sizeof(x)/sizeof(int);
    for(int i=0; i<len; i++)
    fprintf(stderr," %d ",x[i]);
    printf("\n");
    return 0;
}