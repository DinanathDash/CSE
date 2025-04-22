#include<stdio.h>
int r() {
    static int num = 7;
    return num--;
}
int main() {
    for (r(); r(); r())
        printf("%d ", r());
    return 0;
}