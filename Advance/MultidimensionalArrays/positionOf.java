package multidimensionalArrays;
import java.util.*;
public class positionOf {
    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in) ;
       int[][] matrix = readMatrix(scan);
       int n = Integer.parseInt(scan.nextLine());
       boolean isFound = false;
        for(int row  = 0 ; row <matrix.length; row++){
            for(int col = 0 ; col < matrix[row].length; col++){
                if(matrix[row][col] == n){
                    System.out.println(row + " " + col);
                    isFound = true;
                }
            }
        } 
        if(!isFound){
            System.out.println("not found");
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


}
