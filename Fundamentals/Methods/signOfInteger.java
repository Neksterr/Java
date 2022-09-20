package methods;
import java.util.*;

public class signOfInteger {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        int number = Integer.parseInt(scan.nextLine());
        printSign(number);


    }
    public static void printSign(int number){
        if(number == 0){
            System.out.println("The number is 0 is zero.");
        } else if(number > 0){
            System.out.printf("The number %d is positive.", number);
        } else {
            System.out.printf("The number %d is negative.", number);
        }
    }
}
