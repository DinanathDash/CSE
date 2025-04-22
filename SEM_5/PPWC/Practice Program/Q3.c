#include <stdio.h>

int main() {
    int amount, hundreds, fifties, tens;
    printf("Enter the amount to be withdrawn (in hundreds): ");
    scanf("%d", &amount);
    hundreds = amount / 100;
    amount = amount % 100;
    fifties = amount / 50;
    amount = amount % 50;
    tens = amount / 10;
    printf("Number of 100-denomination notes: %d\n", hundreds);
    printf("Number of 50-denomination notes: %d\n", fifties);
    printf("Number of 10-denomination notes: %d\n", tens);

    return 0;
}
