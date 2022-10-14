package AssociativeArrays;
import java.util.*;
public class courses {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Map<String,List<String>> courseMap = new LinkedHashMap<>();

        String input = scan.nextLine();

        while(!input.equals("end")){
            String[] data = input.split(" : ");
            String course = data[0];
            String name = data[1];
            if(!courseMap.containsKey(course)){
                courseMap.put(course, new ArrayList<>());
                courseMap.get(course).add(name);
            } else {
                courseMap.get(course).add(name);
            }
            input = scan.nextLine();
        }
        for(Map.Entry<String, List<String>> entry : courseMap.entrySet()){
            System.out.printf("%s: %d%n", entry.getKey(),entry.getValue().size());
            for (int i = 0; i < entry.getValue().size(); i++) {
                System.out.printf("-- %s%n", entry.getValue().get(i));
            }
        }

    }
}
