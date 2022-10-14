package AssociativeArrays;

import java.util.*;

public class studentAcademy {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Map<String, List<Double>> studentsMap = new LinkedHashMap<>();
        int lines = Integer.parseInt(scan.nextLine());
        for (int i = 0; i < lines; i++) {
            String name = scan.nextLine();

            Double grade = Double.parseDouble(scan.nextLine());

            if (!studentsMap.containsKey(name)) {
                studentsMap.put(name, new ArrayList<>());
                studentsMap.get(name).add(grade);
            } else {
                studentsMap.get(name).add(grade);
            }

        }
        
        studentsMap.entrySet().stream().filter(s -> s.getValue().stream().mapToDouble(x -> x).average().orElse(0.0) >= 4.50).forEach(entry ->{ double averageGrade = entry.getValue().stream().mapToDouble(x -> x).average().orElse(0.0);
        System.out.printf("%s -> %.2f%n", entry.getKey(), averageGrade);});

    }
}
