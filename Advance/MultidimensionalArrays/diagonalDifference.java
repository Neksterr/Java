package multidimensionalArrays;

import java.util.*;

public class diagonalDifference {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int rows = Integer.parseInt(scan.nextLine());
        int[][] matrix = readMatrix(rows, scan);
        int sumMain = 0;
        int sumSub = 0;
        for (int row = 0; row < rows; row++) {

            sumMain += matrix[row][row];

        }
        for (int row = 0, col = rows - 1; row < rows; row++, col--) {

            sumSub += matrix[row][col];

        }
        int max = Math.max(sumMain, sumSub);
        int min = Math.min(sumMain, sumSub);
        int difference = max - min;
        System.out.println(difference);
    }

    public static int[][] readMatrix(int rows, Scanner scan) {

        int[][] matrix = new int[rows][];
        for (int row = 0; row < rows; row++) {
            int[] arr = Arrays.stream(scan.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            matrix[row] = arr;
        }

        return matrix;
    }
}
