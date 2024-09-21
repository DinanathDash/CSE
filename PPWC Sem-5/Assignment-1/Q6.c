#include <stdio.h>

int main() {
    float m, kms, cms, mms, feet, in;

    printf("Enter distance in meters: ");
    scanf("%f", &m);

    kms = m * 0.001;
    cms = m * 100;
    mms = m * 1000;
    feet = m * 3.28084;
    in = m * 39.3701;

    printf("+------------------+------------------+\n");
    printf("| Unit             | Value            |\n");
    printf("+------------------+------------------+\n");
    printf("| Meters           | %16.2f |\n", m);
    printf("| Kilometers       | %16.3f |\n", kms);
    printf("| Centimeters      | %16.2f |\n", cms);
    printf("| Millimeters      | %16.2f |\n", mms);
    printf("| Feet             | %16.2f |\n", feet);
    printf("| Inches           | %16.2f |\n", in);
    printf("+------------------+------------------+\n");

    return 0;
}
