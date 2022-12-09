package setsAndMapsAdv;

import java.util.*;

public class avrStudentsGrade {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = Integer.parseInt(scan.nextLine());
        Map<String, List<Double>> studetsMap = new TreeMap<>();

        for (int i = 0; i < num; i++) {
            String[] input = scan.nextLine().split(" ");
            String name = input[0];
            double grade = Double.parseDouble(input[1]);
            if (!studetsMap.containsKey(name)) {
                studetsMap.put(name, new ArrayList<>());
                studetsMap.get(name).add(grade);
            } else {
                studetsMap.get(name).add(grade);
            }
        }

        studetsMap.forEach((k,v) -> {
            System.out.print(k + " -> ");
            int countG = 0;
            double sum = 0;
            for(double grade : v){
            countG++;
            sum +=  grade;
            System.out.printf("%.2f ", grade);
            }
            System.out.printf("(avg: %.2f)", sum / countG);
            System.out.println();
           });
        };
}
