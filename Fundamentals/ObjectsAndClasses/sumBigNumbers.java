package ObjectsAndClasses;
import java.math.BigInteger;
import java.util.*;
public class sumBigNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        BigInteger num1 = new BigInteger(scan.nextLine());
        BigInteger num2 = new BigInteger(scan.nextLine());
        BigInteger sum = num1.add(num2);
        System.out.println(sum);

    }
}
