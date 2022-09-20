package methods;
import java.util.*;
public class printingTriangle {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int start = 1;
        int end = Integer.parseInt(scan.nextLine());
        for(int i = 0; i <= end ; i++){
            printTriangle(start, i);
        }
        for(int i = end - 1; i >= 1; i--){
            printTriangle(start, i);
        }

    }
    public static void printTriangle(int start, int end){
        for (int i  = start; i <= end; i++){
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
