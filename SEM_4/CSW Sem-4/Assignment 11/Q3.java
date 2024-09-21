class MatrixMultiplicationThread extends Thread {
    private int[][] A;
    private int[][] B;
    private int[][] result;
    private int row;

    public MatrixMultiplicationThread(int[][] A, int[][] B, int[][] result, int row) {
        this.A = A;
        this.B = B;
        this.result = result;
        this.row = row;
    }

    @Override
    public void run() {
        for (int j = 0; j < B[0].length; j++) {
            result[row][j] = 0;
            for (int k = 0; k < A[0].length; k++) {
                result[row][j] += A[row][k] * B[k][j];
            }
        }
    }
}

public class Q3 {
    public static void main(String[] args) {
        int[][] A = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        int[][] B = {
            {9, 8, 7},
            {6, 5, 4},
            {3, 2, 1}
        };

        int rowsA = A.length;
        int colsA = A[0].length;
        int colsB = B[0].length;

        if (colsA != B.length) {
            throw new IllegalArgumentException("Number of columns in A must be equal to the number of rows in B.");
        }

        int[][] result = new int[rowsA][colsB];
        Thread[] threads = new Thread[rowsA];

        for (int i = 0; i < rowsA; i++) {
            threads[i] = new MatrixMultiplicationThread(A, B, result, i);
            threads[i].start();
        }

        for (int i = 0; i < rowsA; i++) {
            try {
                threads[i].join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("Resultant Matrix:");
        for (int i = 0; i < rowsA; i++) {
            for (int j = 0; j < colsB; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }
}
