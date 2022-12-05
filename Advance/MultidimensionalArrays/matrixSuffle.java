package multidimensionalArrays;
import java.util.*;
public class matrixShuffling {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] data = scan.nextLine().split(" ");
        int rows = Integer.parseInt(data[0]);
        int cols = Integer.parseInt(data[1]);
        int[][] matrix = readMatrix(rows,cols,scan);
        String input = scan.nextLine();
        while(!input.equals("END")){
            String[] commandInput = input.split(" ");
            String command = commandInput[0];
            int row1 = Integer.parseInt(commandInput[1]);
            int col1 = Integer.parseInt(commandInput[2]);
            int row2 = Integer.parseInt(commandInput[3]);
            int col2 = Integer.parseInt(commandInput[4]);
            if(command.equals("swap") && isValid(rows, cols, row1, row2, col1, col2)){
                int connect = matrix[row1][col1];
                matrix[row1][col1] = matrix[row2][col2];
                matrix[row2][col2] = connect;
                printMatrix(matrix);

            } else {
                System.out.println("Invalid input!");
            }
            input = scan.nextLine();
        }
    }

    public static int[][] readMatrix(int rows,int cols, Scanner scan) {

        int[][] matrix = new int[rows][cols];
        for (int row = 0; row < rows; row++) {
            int[] arr = Arrays.stream(scan.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
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
    public static boolean isValid(int rows,int cols, int row1,int row2, int col1, int col2){
        if(!(row1 <= rows && row1 >= 0 && col1 <= cols && col1 >= 0 && row2 <= rows && row2 >= 0 && col2 <= cols && col2 >= 0)){
            return false;
        }
        return true;
    }
}
