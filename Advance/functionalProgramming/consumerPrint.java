package functional;
import java.util.*;
import java.util.function.Consumer;
import java.util.stream.Collector;
import java.util.stream.Collectors;
public class consumerPrint {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // Peter George Alex
        Consumer<? super String> print = p -> System.out.println(p);
        List<String> names = Arrays.stream(scan.nextLine().split( " ")).collect(Collectors.toList());
        names.stream().forEach(print);
    }
}
