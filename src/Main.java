import logic.Matrix;
import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        final int rows = 4;
        final int cols = 5;
        final int maxValue = 20; 
        int[][] matrix = generateRandomMatrix(rows, cols, maxValue);

        System.out.println("Згенерована матриця:");
        for (int i = 0; i < matrix.length; i++) {
            System.out.println("Рядок " + (i + 1) + ": " + Arrays.toString(matrix[i]));
        }

        int maxRowIndex = Matrix.findRowWithMaxSum(matrix);
        System.out.println("\nНомер рядка з максимальною сумою елементів: " + (maxRowIndex + 1));
    }

    private static int[][] generateRandomMatrix(int rows, int cols, int maxValue) {
        Random random = new Random();
        int[][] matrix = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = random.nextInt(maxValue + 1);
            }
        }

        return matrix;
    }
}
