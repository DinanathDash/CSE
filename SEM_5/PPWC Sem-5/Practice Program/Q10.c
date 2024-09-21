#include <stdio.h>

int main() {
    float fahrenheit, celsius;
    printf("Enter temperature in Fahrenheit: ");
    scanf("%f", &fahrenheit);
    celsius = ((float)5.0 / (float)9.0) * (fahrenheit - 32);
    printf("Temperature in Celsius: %.2f\n", celsius);

    return 0;
}
