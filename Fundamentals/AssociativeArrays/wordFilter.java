package AssociativeArrays;
import java.util.*;
public class wordFilter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] words = Arrays.stream(scan.nextLine().split(" ")).filter(w -> w.length() % 2 ==0).toArray(String[]::new);
        System.out.println(String.join(System.lineSeparator(), words));
    }
}
