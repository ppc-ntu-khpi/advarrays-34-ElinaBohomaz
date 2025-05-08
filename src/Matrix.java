package logic;

import java.util.Arrays;

public class Matrix {

      public static int findRowWithMaxSum(int[][] matrix) {
        if (matrix == null || matrix.length == 0) {
            throw new IllegalArgumentException("Матриця не може бути порожньою або null.");
        }

        int maxIndex = 0;
        int maxSum = Arrays.stream(matrix[0]).sum();

        for (int i = 1; i < matrix.length; i++) {
            if (matrix[i].length != matrix[0].length) {
                throw new IllegalArgumentException("Усі рядки мають бути однакової довжини.");
            }

            int currentSum = Arrays.stream(matrix[i]).sum();
            if (currentSum > maxSum) {
                maxSum = currentSum;
                maxIndex = i;
            }
        }

        return maxIndex;
    }
}
