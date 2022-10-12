package AssociativeArrays;
import java.util.*;
public class minersTask {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        Map<String, Integer> resourceMap = new LinkedHashMap<>();
        while(!input.equals("stop")){

            int quantity = Integer.parseInt(scan.nextLine());
            if(!resourceMap.containsKey(input)){
                resourceMap.put(input, quantity);
            } else {
                int currentValue = resourceMap.get(input);
                resourceMap.put(input, currentValue + quantity);
            }

            input = scan.nextLine();
        }

        resourceMap.forEach((k, v) -> System.out.printf("%s -> %d%n", k, v));

    }
}
