package multidimensionalArrays;

import java.util.*;

public class sumMatrixElements {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[][] matrix = readMatrix(scan);
        int sum = 0;
        int max = 0;
        int[][] result = new int[2][2];
        for (int row = 0; row < matrix.length - 1; row++) {
            for (int col = 0; col < matrix[row].length - 1; col++) {
                sum = matrix[row][col] + matrix[row][col + 1] + matrix[row + 1][col] + matrix[row + 1][col + 1];

                if (max < sum) {
                    max = sum;
                    result = new int[][] { { matrix[row][col], matrix[row][col + 1] },
                            { matrix[row + 1][col], matrix[row + 1][col + 1] } };
                }
            }

        }
        printMatrix(result);
        System.out.println(max);
    }

    public static int[][] readMatrix(Scanner scan) {
        String[] inputStat = scan.nextLine().split(", ");
        int rows = Integer.parseInt(inputStat[0]);
        int cols = Integer.parseInt(inputStat[1]);
        int[][] matrix = new int[rows][cols];
        for (int row = 0; row < rows; row++) {
            int[] arr = Arrays.stream(scan.nextLine().split(", ")).mapToInt(Integer::parseInt).toArray();
            matrix[row] = arr;
        }

        return matrix;
    }

    private static void printMatrix(int[][] matrix) {
        for (int r = 0; r < matrix.length; r++) {
            for (int c = 0; c < matrix[r].length; c++) {
                System.out.print(matrix[r][c] + " ");
            }
            System.out.println();
        }
    }
}
