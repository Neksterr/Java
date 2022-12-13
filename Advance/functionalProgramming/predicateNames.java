package functional;
import java.text.Collator;
import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;
public class predicateNames {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());
        List<String> names = Arrays.stream(scan.nextLine().split(" ")).collect(Collectors.toList());
        Predicate<String> pred = name -> name.length() <= n;
        names.stream().filter(pred).forEach(e -> System.out.println(e));
    }
}
