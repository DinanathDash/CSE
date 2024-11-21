#include <stdio.h>
#define MAX 10
void transposeMatrix(int *m, int *t, int rows, int cols) {
    for (int i = 0; i < rows; i++)
        for (int j = 0; j < cols; j++)
            *(t + j * rows + i) = *(m + i * cols + j);
}
void printMatrix(int *m, int rows, int cols) {
    for (int i = 0; i < rows * cols; i++) {
        printf("%d ", *(m + i));
        if ((i + 1) % cols == 0) printf("\n");
    }
}
int main() {
    int m[MAX][MAX], t[MAX][MAX], rows, cols;
    printf("Enter rows and columns: ");
    scanf("%d %d", &rows, &cols);
    printf("Enter matrix elements:\n");
    for (int i = 0; i < rows * cols; i++)
        scanf("%d", (m[0] + i));
    transposeMatrix(&m[0][0], &t[0][0], rows, cols);
    printf("\nTransposed Matrix:\n");
    printMatrix(&t[0][0], cols, rows);
    return 0;
}