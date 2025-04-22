#include <stdio.h>
#include <unistd.h>
int main(){
    struct stud s1={1,20};
    pid_t pid=fork();
    if(pid==0){
        struct stud s1={2,30};
        printf("%d %d\n",s1.r,s1.m);
        return 0;
    } else{
        sleep(10);
        printf("%d %d\n",s1.r,s1.m);
        return 0;
    }
}
struct stud{
    int r;
    int m;
};