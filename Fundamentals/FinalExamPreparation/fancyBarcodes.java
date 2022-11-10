
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class fancyBarcodes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        String product = "";
        for (int i = 0; i < n; i++) {
            String barcode = scan.nextLine();
            Pattern patt = Pattern.compile("(@#+)(?<bar>[A-Z][A-Za-z0-9]{4,}[A-Z])\\1");
            Matcher match = patt.matcher(barcode);
            if (!match.find()) {
                System.out.println("Invalid barcode");
                continue;
            } else {
                product = match.group("bar");
            }
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < product.length(); j++) {

                if (Character.isDigit(product.charAt(j))) {
                    sb.append(product.charAt(j));
                }

            }
            if (sb.length() == 0) {

                System.out.println("Product group: 00");

            } else {
                System.out.println("Product group: " + sb);
            }
        }
    }
}
