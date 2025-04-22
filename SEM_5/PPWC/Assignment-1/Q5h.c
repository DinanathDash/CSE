#include<stdio.h>
int main() {
    printf("%d==%i==%o==%x\n", 32, 32, 32, 32);
    printf("%d==%i==%#o==%#x\n", 32, 32, 32, 32);
    printf("%d==%i==%#o==%#X\n", 32, 32, 32, 32);
    printf("%+d==%+i==%#o==%#X\n", 32, 32, 032, 0x45b);
    return 0;
}
