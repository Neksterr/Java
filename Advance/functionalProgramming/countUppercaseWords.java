package functional;
import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class countUppercaseWords {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Predicate<String> preUppercase = s -> Character.isUpperCase(s.charAt(0));
        List<String> words = Arrays.stream(scan.nextLine().split(" ")).filter(preUppercase).collect(Collectors.toList());
        System.out.println(words.size());
        words.forEach(w -> System.out.println(w));
    }
}
