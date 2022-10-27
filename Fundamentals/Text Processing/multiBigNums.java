package textProcessing;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.*;

public class multiBigNum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        BigInteger num =new BigInteger(scan.nextLine()) ;
        BigInteger num2 =new BigInteger(scan.nextLine()) ;
        System.out.println(num.multiply(num2));
        
    }
}
