package multidimensionalArrays;
import java.io.FileReader;
import java.util.*;
public class compareMatrices {
    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in); 

       int[][] firstMatrix = readMatrix(scan);
       int[][] secondMatrix = readMatrix(scan);
       if(Arrays.deepEquals(firstMatrix, secondMatrix)){
        System.out.println("equal");
       } else { 
        System.out.println("not equal");
       }

    }
    





     public static int[][] readMatrix(Scanner scan){
        String[] inputStat = scan.nextLine().split(" ");
        int rows = Integer.parseInt(inputStat[0]);
        int cols = Integer.parseInt(inputStat[1]);
        int[][] matrix = new int[rows][cols];
        for(int row = 0; row < rows; row++){
            int[] arr = Arrays.stream(scan.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            matrix[row] = arr;
        }

        return matrix;

     }
     public static void printMatrix(int[][] matrix){
        for(int row = 0; row < matrix.length; row++){
            for(int col = 0; col < matrix[row].length; col++ ){
                System.out.println(matrix[row][col] + " ");
            }
            System.out.println();
        }
     }
}
