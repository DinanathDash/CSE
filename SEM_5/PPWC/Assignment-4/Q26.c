#include <stdio.h>
#define MAX 10
void transposeMatrix(int *matrix, int *transpose, int rows, int cols) {
    for (int i = 0; i < rows; i++)
        for (int j = 0; j < cols; j++)
            *(transpose + j * rows + i) = *(matrix + i * cols + j);
}
void printMatrix(int *matrix, int rows, int cols) {
    for (int i = 0; i < rows * cols; i++) {
        printf("%d ", *(matrix + i));
        if ((i + 1) % cols == 0) printf("\n");
    }
}
int main() {
    int matrix[MAX][MAX], transpose[MAX][MAX], rows, cols;
    printf("Enter rows and columns: ");
    scanf("%d %d", &rows, &cols);
    printf("Enter matrix elements:\n");
    for (int i = 0; i < rows * cols; i++)
        scanf("%d", (matrix[0] + i));
    transposeMatrix(&matrix[0][0], &transpose[0][0], rows, cols);
    printf("\nTransposed Matrix:\n");
    printMatrix(&transpose[0][0], cols, rows);
    return 0;
}