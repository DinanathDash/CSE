import java.util.Random;
public class A5 {
    public static void main(String[] args) {
        int[][] matrix = new int[4][4];
        Random random = new Random();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = random.nextInt(2);
            }
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        int maxRow = -1;
        int maxRowSum = -1;
        for (int i = 0; i < matrix.length; i++) {
            int rowSum = 0;
            for (int j = 0; j < matrix[i].length; j++) {
                rowSum += matrix[i][j];
            }
            if (rowSum > maxRowSum) {
                maxRowSum = rowSum;
                maxRow = i;
            }
        }
        int maxCol = -1;
        int maxColSum = -1;
        for (int j = 0; j < matrix[0].length; j++) {
            int colSum = 0;
            for (int i = 0; i < matrix.length; i++) {
                colSum += matrix[i][j];
            }
            if (colSum > maxColSum) {
                maxColSum = colSum;
                maxCol = j;
            }
        }
        System.out.println("The first row with the most ones is " + maxRow);
        System.out.println("The first column with the most ones is " + maxCol);
    }
}