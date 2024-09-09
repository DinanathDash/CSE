#include <stdio.h>

int main() {
    int int_var = 10;
    float float_var = 10.5;
    char char_var = 'A';
    double double_var = 20.1234;

    printf("Address of int_var: %p\n", (void*)&int_var);
    printf("Address of float_var: %p\n", (void*)&float_var);
    printf("Address of char_var: %p\n", (void*)&char_var);
    printf("Address of double_var: %p\n", (void*)&double_var);

    return 0;
}
