package multidimensionalArrays;
import java.util.*;
public class findTheRealQueen {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        char[][] matrix = readMatrix(scan);
        for(int row = 0 ; row < 8; row++){
            for(int col = 0; col < 8 ; col++){
                if(matrix[row][col] == 'q' && isQueenValid(matrix, row, col)){
                    System.out.printf("%d %d", row, col);
                    return;
                }
            }
        }
    }

    public static boolean checkDiagonal(char[][] matrix, int row, int col){
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (i - row == j - col && matrix[row][col] == 'q') {
                    return true;
                }
            }
        }
        return false;
    }
    public static boolean checkCol(char[][] matrix,int row,int col){
        for (int i = 0; i < 8; i++) {
            if (i != row && matrix[i][col] == 'q') {
                return false;
            }
        }
        return true;
    }
    public static boolean checkRow(char[][] matrix,int row,int col){
        for (int i = 0; i < 8; i++) {
            if (i != col && matrix[row][i] == 'q') {
                return false;
            }
        }
        return true;
    }
    private static boolean isQueenValid(char[][] matrix, int row, int col) {
        return checkRow(matrix, row, col) && checkCol(matrix, row, col) && checkDiagonal(matrix, row, col);
    }
    public static char[][] readMatrix(Scanner scan) {
        
     
        char[][] arr = new char[8][8];
        for (int row = 0; row < 8; row++) {
          arr[row] = scan.nextLine().replaceAll("\\s+", "").toCharArray();
           
        }
        return arr;

    }
}
