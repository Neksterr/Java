package multidimensionalArrays;

import java.util.*;

public class intersectionOfTwoMatrices {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int rows =Integer.parseInt(scan.nextLine());
        int cols = Integer.parseInt(scan.nextLine());
        char[][] firstM = readMatrix(scan,rows,cols);
        char[][] secondM = readMatrix(scan,rows,cols);

        for(int row = 0 ; row < rows; row++){
            for(int col = 0; col < cols; col++){
               char output = firstM[row][col] == secondM[row][col] ? firstM[row][col] : '*';
               System.out.print(output + " ");
            }
            System.out.println();
        }

    }

    public static char[][] readMatrix(Scanner scan, int rows, int cols) {
        
     
        char[][] arr = new char[rows][cols];
        for (int row = 0; row < rows; row++) {
          arr[row] = scan.nextLine().replaceAll("\\s+", "").toCharArray();
           
        }
        return arr;

    }
}
