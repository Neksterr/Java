package Abstraction;
import java.util.*;
public class RhombusStars {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
       int n = Integer.parseInt(scan.nextLine());
        printRhombus(n);
    }
    public static void printRhombus(int n){
        rhombusUpperPart(n);
        rhombusBottomPart(n);
    }
    public static void rhombusBottomPart(int n ){
        for (int i = n - 1; i > 0 ; i--){
            for(int j = 0 ; j < n - i; j ++){
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++){
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }
    public static void rhombusUpperPart(int n){
        for(int i = 1 ; i < n * 2 - 1 ; i++){

            for(int j = 0 ; j < n - i; j ++){
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++){
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }
    
}
