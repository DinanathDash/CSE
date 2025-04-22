#include <stdio.h>

int main() {
    int int_var = 10;
    float float_var = 5.75;
    char char_var = 'A';

    float result1 = int_var + float_var;
    printf("int_var + float_var = %.2f\n", result1);

    int result2 = (int) float_var;
    printf("float_var cast to int = %d\n", result2);

    int result3 = (int) char_var;
    printf("ASCII value of char_var = %d\n", result3);

    char result4 = (char) int_var;
    printf("int_var cast to char = %c\n", result4);

    return 0;
}
