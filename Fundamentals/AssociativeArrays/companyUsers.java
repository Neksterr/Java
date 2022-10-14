package AssociativeArrays;
import java.util.*;
public class companyUsers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Map<String, List<String>> companyMap = new LinkedHashMap<>();

        String input = scan.nextLine();

        while(!input.equals("End")){
            String[] data = input.split(" -> ");
            String companyName = data[0];
            String employee = data[1];

            if(!companyMap.containsKey(companyName)){
                companyMap.put(companyName,new ArrayList<>());
                companyMap.get(companyName).add(employee);
            }
            else{
                companyMap.get(companyName).add(employee);
            }

            input = scan.nextLine();
        }
        companyMap.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(company -> {System.out.println(company.getKey());
        company.getValue().forEach(employee -> System.out.println("-- " + employee));});
    }
}
