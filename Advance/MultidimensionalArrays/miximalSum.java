package multidimensionalArrays;
import java.util.*;
public class maximalSum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] data = scan.nextLine().split(" ");
        int rows = Integer.parseInt(data[0]);
        int cols = Integer.parseInt(data[1]);
        int[][] matrix = readMatrix(rows,cols,scan);
        
        int sum = 0;
        int max = 0;
        int bestRow = -1;
        int bestCol = -1;
        for(int row = 0; row < rows - 2; row ++){
            for(int col = 0 ; col < cols - 2; col++){
                sum =  matrix[row][col] + matrix[row][col + 1] + matrix[row][col + 2]
                + matrix[row + 1 ][col] + matrix[row + 1][col + 1] + matrix[row + 1][col + 2]
                + matrix[row + 2][col] + matrix[row + 2][col + 1] + matrix[row + 2][col + 2];
                if (sum > max){
                    max = sum;
                    bestRow = row;
                    bestCol = col;
                }
            }
        }
        System.out.printf("Sum = %d%n",max);
        for(int row = bestRow; row < bestRow + 3; row++){
            for(int col = bestCol; col < bestCol + 3; col++){
                System.out.print(matrix[row][col]+ " ");
            }
            System.out.println();
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
}
