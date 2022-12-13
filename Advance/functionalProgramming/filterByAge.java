package functional;
import java.util.*;
import java.util.function.Consumer;
import java.util.function.Predicate;
public class filterByAge {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        Map<String,Integer> person = new LinkedHashMap<>();
        for(int i = 0; i < n; i++){
            String[] data = scan.nextLine().split(", ");
            person.put(data[0],Integer.parseInt(data[1]));
        }
        String ageCondition = scan.nextLine();
        int age = Integer.parseInt(scan.nextLine());
        String outputFormat = scan.nextLine();
        
        person.entrySet()
                .stream()
                .filter(getAgeFilter(ageCondition, age))
                .forEach(getPrintEntryConsumer(outputFormat));

    }
    private static Predicate<Map.Entry<String, Integer>> getAgeFilter(String ageCondition, int age) {
        if (ageCondition.equals("older")) {
            return entry -> entry.getValue() >= age;
        }
        return entry -> entry.getValue() <= age;
    }
    private static Consumer<Map.Entry<String, Integer>> getPrintEntryConsumer(String outputFormat) {
        switch (outputFormat) {
            case "name":
                return entry -> System.out.println(entry.getKey());
            case "age":
                return entry -> System.out.println(entry.getValue());
            default:
                return entry -> System.out.printf("%s - %d%n", entry.getKey(), entry.getValue());
        }
    }
}
