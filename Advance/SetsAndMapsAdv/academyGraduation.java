package setsAndMapsAdv;

import java.util.*;
import java.util.function.DoubleBinaryOperator;
import java.util.stream.Collectors;

public class academyGraduation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        Map<String, Double[]> stutMap = new TreeMap<>();
        for (int i = 0; i < n; i++) {
            String  name = scan.nextLine();
            String[] scores = scan.nextLine().split("\\s+");
            Double[] grades = new Double[scores.length];
            for (int j = 0; j < scores.length; j++) {
                grades[j] = Double.parseDouble(scores[j]);
            }
            stutMap.put(name, grades);

        }
        for (Map.Entry<String, Double[]> student : stutMap.entrySet()) {
            double sum = 0;
            Double[] gradesToSum = student.getValue();
            for(int i = 0; i< gradesToSum.length; i++){
                sum += gradesToSum[i];
            }
            System.out.printf("%s is graduated with %s\n", student.getKey(), sum/student.getValue().length);
        }
    }
}
