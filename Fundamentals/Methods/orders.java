package methods;
import java.util.*;
public class orders {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String product = scan.nextLine();
        int num = Integer.parseInt(scan.nextLine());
        printResult(product, num);

    }
    public static void printResult(String product, int num){
        switch(product){
            case "coffee":
            System.out.printf("%.2f",num * 1.50);
            break;
            case "water":
            System.out.printf("%.2f",num * 1.00);
            break;
            case "coke":
            System.out.printf("%.2f",num * 1.40);
            break;
            case "snacks":
            System.out.printf("%.2f",num * 2.00);
            break;

        }
    }
}
