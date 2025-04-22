#include <stdio.h>
int main() {
    int intArr[] = {10, 13, 20, 33, 44};
    float floatArr[] = {10.2, 13.3, 20.0, 33.3, 45.3, 89.9};
    int *intPtr = intArr;
    printf("Integer array values and addresses:\n");
    for (int i = 0; i < 5; i++) {
        printf("Value of intArray[%d]: %d, Address: %p\n", i, *(intPtr + i), (intPtr + i));
    }
    float *floatPtr = floatArr;
    printf("\nFloat array values and addresses:\n");
    for (int i = 0; i < 6; i++) {
        printf("Value of floatArray[%d]: %.1f, Address: %p\n", i, *(floatPtr + i), (floatPtr + i));
    }
    return 0;
}