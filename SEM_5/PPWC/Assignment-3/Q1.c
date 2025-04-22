#include <stdio.h>
int main() {
    int prime_lt_100[] = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97};

    int result_a = prime_lt_100[24];
    printf("Result (a): prime_lt_100[24] = %d\n", result_a);

    int i = 10;
    int result_b = prime_lt_100[i + 4];
    printf("Result (b): prime_lt_100[i+4] = %d\n", result_b);

    int index_c = prime_lt_100[2] + prime_lt_100[0];
    int result_c = prime_lt_100[index_c];
    printf("Result (c): prime_lt_100[prime_lt_100[2] + prime_lt_100[0]] = %d\n", result_c);

    prime_lt_100[6] = prime_lt_100[6] + prime_lt_100[16];
    printf("Result (d): prime_lt_100[6] (after assignment) = %d\n", prime_lt_100[6]);

    return 0;
}