package methods;
import java.util.*;
public class calculations {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String command = scan.nextLine();
        int num1 = Integer.parseInt(scan.nextLine());
        int num2 = Integer.parseInt(scan.nextLine());

        switch(command){
            case "add":
            commandAdd(num1, num2);
            break;
            case "subtract":
            commandSubtract(num1, num2);
            break;
            case "multiply":
            commandMultiply(num1, num2);
            break;
            case "divide":
            commandDivide(num1, num2);
            break;
        }
    }
    public static void commandSubtract(int num1, int num2){
        System.out.println(num1 - num2);
    }
    public static void commandAdd(int num1, int num2){
        System.out.println(num1 + num2);
    }
    public static void commandMultiply(int num1, int num2){
        System.out.println(num1 * num2);
    }
    public static void commandDivide(int num1, int num2){
        System.out.println(num1 / num2);
    }
}
