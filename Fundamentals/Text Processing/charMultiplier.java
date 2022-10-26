package textProcessing;
import java.math.BigInteger;
import java.util.*;
public class characterMulti {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] input = scan.nextLine().split(" ");
        BigInteger result = BigInteger.valueOf(0);
        StringBuilder sb = new StringBuilder();
        int len1 = input[0].length();
        int len2 = input[1].length();
        int maxLen = (len1 > len2) ? len1 : len2;
        for(int i = 0; i < maxLen;i++){
            int chr1 = (i < len1) ? input[0].charAt(i) : 1;
            int chr2 = (i < len2) ? input[1].charAt(i) : 1;
            result = result.add(BigInteger.valueOf(chr1 * chr2));
        }System.out.println(result);
    }
}
