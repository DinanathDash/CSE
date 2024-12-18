#include <stdio.h>
#include <unistd.h>
int main(){
    int i;
    for(i=0;i<12;i++){
        if(i%3==0){
            fork();
        }
    }
    return 0;
}