package setsAndMapsAdv;

import java.util.*;

public class countTheRealNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Map<Double, Integer> numMap = new LinkedHashMap<>();
        Arrays.stream(scan.nextLine().split(" ")).mapToDouble(Double::parseDouble).forEach(n -> {
            if(numMap.containsKey(n)){
            int old = numMap.get(n);
            numMap.put(n, old + 1);
        } else {
            numMap.put(n, 1);
        }});
        for (var entry : numMap.entrySet()) {
            System.out.println(String.format("%.1f -> %d", entry.getKey(),entry.getValue()));
        }
    }
}
