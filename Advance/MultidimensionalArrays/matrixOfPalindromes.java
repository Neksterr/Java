package multidimensionalArrays;

import java.util.*;



public class matrixOfPalindromes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] input = scan.nextLine().split(" ");
        int rows = Integer.parseInt(input[0]);
        int cols = Integer.parseInt(input[1]);
        String[][] matrix = new String[rows][cols];
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                char out = (char) ('a' + row);
                char in = (char) (out + col);
                matrix[row][col] = String.valueOf(out) + in + out;
                
            }
        }
        for(int row = 0; row < matrix.length; row++){
            for(int col = 0; col < matrix[row].length; col++ ){
                System.out.print(matrix[row][col] + " ");
            }
            System.out.println();
        }

    }
}
