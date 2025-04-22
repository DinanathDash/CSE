public class Q21 {
    public static void main(String[] args) {
        int[][] matrix1 = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int[][] matrix2 = {
                {9, 8, 7},
                {6, 5, 4},
                {3, 2, 1}
        };

        System.out.println("Matrix 1:");
        printMatrix(matrix1);
        System.out.println("Matrix 2:");
        printMatrix(matrix2);

        System.out.println("Matrix Addition:");
        try {
            int[][] resultAddition = addMatrices(matrix1, matrix2);
            printMatrix(resultAddition);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Matrix Multiplication:");
        try {
            int[][] resultMultiplication = multiplyMatrices(matrix1, matrix2);
            printMatrix(resultMultiplication);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Transpose of Matrix 1:");
        int[][] transposeMatrix = transpose(matrix1);
        printMatrix(transposeMatrix);

        try {
            int element = getElement(matrix1, 3, 3);
            System.out.println("Element at (3, 3): " + element);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Index out of bounds while accessing element at (3, 3)");
        }
    }

    public static int[][] addMatrices(int[][] matrix1, int[][] matrix2) {
        if (matrix1.length != matrix2.length || matrix1[0].length != matrix2[0].length) {
            throw new IllegalArgumentException("Matrix dimensions are not compatible for addition.");
        }

        int rows = matrix1.length;
        int cols = matrix1[0].length;
        int[][] result = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }

        return result;
    }

    public static int[][] multiplyMatrices(int[][] matrix1, int[][] matrix2) {
        int m1Rows = matrix1.length;
        int m1Cols = matrix1[0].length;
        int m2Rows = matrix2.length;
        int m2Cols = matrix2[0].length;

        if (m1Cols != m2Rows) {
            throw new IllegalArgumentException("Matrix dimensions are not compatible for multiplication.");
        }

        int[][] result = new int[m1Rows][m2Cols];

        for (int i = 0; i < m1Rows; i++) {
            for (int j = 0; j < m2Cols; j++) {
                for (int k = 0; k < m1Cols; k++) {
                    result[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }

        return result;
    }

    public static int[][] transpose(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int[][] transposeMatrix = new int[cols][rows];

        for (int i = 0; i < cols; i++) {
            for (int j = 0; j < rows; j++) {
                transposeMatrix[i][j] = matrix[j][i];
            }
        }

        return transposeMatrix;
    }

    public static int getElement(int[][] matrix, int row, int col) {
        if (row < 0 || row >= matrix.length || col < 0 || col >= matrix[0].length) {
            throw new ArrayIndexOutOfBoundsException("Index out of bounds.");
        }
        return matrix[row][col];
    }

    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }
}
