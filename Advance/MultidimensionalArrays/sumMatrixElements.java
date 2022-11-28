package multidimensionalArrays;
import java.util.*;
public class sumMatrixElements {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[][] matrix = readMatrix(scan);
        int sum = 0;
        for(int row = 0; row < matrix.length; row ++){
            for(int col = 0; col <matrix[row].length; col++){
                sum += matrix[row][col];
            }
        }
        System.out.println(matrix.length);
        System.out.println(matrix[0].length);
        System.out.println(sum);
        


    }
    public static int[][] readMatrix(Scanner scan){
        String[] inputStat = scan.nextLine().split(", ");
        int rows = Integer.parseInt(inputStat[0]);
        int cols = Integer.parseInt(inputStat[1]);
        int[][] matrix = new int[rows][cols];
        for(int row = 0; row < rows; row++){
            int[] arr = Arrays.stream(scan.nextLine().split(", ")).mapToInt(Integer::parseInt).toArray();
            matrix[row] = arr;
        }

        return matrix;
    }
}
