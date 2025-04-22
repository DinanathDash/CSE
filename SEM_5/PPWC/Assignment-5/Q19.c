#include <stdio.h>
#include <stdlib.h>
int main(){
    int i,*p,*rp;
    p=(int *)malloc(5*sizeof(int));
    for(i=0;i<5;i++)
        scanf("%d",p+i);
    rp=(int *)realloc(p,10*sizeof(int));
    for(i=5;i<10;i++)
        scanf("%d",rp+i);
    for(i=0;i<10;i++){
        printf("%d...%d\n",rp[i],*(rp+i));
    }
    return 0;
}