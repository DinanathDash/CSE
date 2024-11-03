#include <stdio.h>
#include <string.h>
#include <math.h>
void binaryToHexadecimal(char binary[]) {
    int len = strlen(binary), hexDigit = 0, hexIndex = 0;
    char hexadecimal[65] = "";
    int padding = (4 - (len % 4)) % 4;
    char paddedBinary[65] = "";
    for (int i = 0; i < padding; i++) {
        strcat(paddedBinary, "0");
    }
    strcat(paddedBinary, binary);
    len = strlen(paddedBinary);
    for (int i = 0; i < len; i += 4) {
        hexDigit = 0;
        for (int j = 0; j < 4; j++) {
            hexDigit = hexDigit * 2 + (paddedBinary[i + j] - '0');
        }
        if (hexDigit < 10) {
            hexadecimal[hexIndex++] = '0' + hexDigit;
        } else {
            hexadecimal[hexIndex++] = 'A' + (hexDigit - 10);
        }
    }
    hexadecimal[hexIndex] = '\0'; 
    printf("Hexadecimal: %s\n", hexadecimal);
}
int main() {
    char binary[65];
    printf("Enter a binary number: ");
    scanf("%64s", binary);
    binaryToHexadecimal(binary);
    return 0;
}