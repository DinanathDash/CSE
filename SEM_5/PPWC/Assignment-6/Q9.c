#include<stdio.h>
int main() {
    register int a = 10;
    int *ptr = NULL;
    ptr = &a;
    *ptr = 5;
    printf("%d", *ptr);
    return 0;
}