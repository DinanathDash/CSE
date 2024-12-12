#include <stdio.h>
int main(){
    struct student {
        int h;
        int w;
        int m;
    };
    struct student s1 = {20, 40, 50};
    struct student *ptr = &s1;
    printf("%d\n", *((int *)ptr + 2));
    return 0;
}

/*Output - 50
Reason - *((int *)ptr + 2) accesses the third member of the structure s1, which is m, and prints it as 50.
*/