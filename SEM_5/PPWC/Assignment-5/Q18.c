#include <stdio.h>
#include <stdlib.h>
int main(){
    int i;
    int *p=(int *)malloc(sizeof(int));
    *p=100;
    p=(int *)malloc(5*sizeof(int));
    for(i=0;i<5;i++){
        scanf("%d",p+i);
    }
    for(i=0;i<5;i++){
        printf("%d...%d\n",p[i],*(p+i));
    }
    return 0;
}