package multidimensionalArrays;

import java.util.*;

public class printDiagonalsofMatrix {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[][] matrix = readMatrix(scan);
        StringBuffer left = new StringBuffer();
        StringBuffer right = new StringBuffer();
        left.append(matrix[0][0] + " ");
        right.append(matrix[matrix.length - 1][0] + " ");
        for (int row = 1; row < matrix.length; row++) {

            left.append(matrix[row][row] + " ");
            right.append(matrix[matrix.length - 1 - row][row] + " ");

        }

        System.out.println(left.toString().trim());
        System.out.println(right.toString().trim());
    }

    public static int[][] readMatrix(Scanner scan) {
        String[] inputStat = scan.nextLine().split(" ");
        int rows = Integer.parseInt(inputStat[0]);

        int[][] matrix = new int[rows][rows];
        for (int row = 0; row < rows; row++) {
            int[] arr = Arrays.stream(scan.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            matrix[row] = arr;
        }

        return matrix;

    }
}
