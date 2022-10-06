package ObjectsAndClasses;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.*;

public class bigFactorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = Integer.parseInt(scan.nextLine());
        BigInteger factoriel = new BigInteger(String.valueOf(1));
        for (int i = 1; i <= num; i++) {
            factoriel = factoriel.multiply(BigInteger.valueOf(i));
        }
        System.out.println(factoriel);
    }
}
