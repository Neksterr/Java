package setsAndMapsAdv;

import java.util.*;

public class populationCounter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        Map<String, Map<String, Long>> countryMap = new LinkedHashMap<>();
        Map<String, Long> countries = new LinkedHashMap<>();

        while (!input.equals("report")) {
            // Sofia|Bulgaria|1
            // Veliko Tarnovo|Bulgaria|2
            // London|UK|4
            // Rome|Italy|3
            // repor
            String[] data = input.split("\\|");
            String city = data[0];
            String country = data[1];
            Long population = Long.parseLong(data[2]);
            countryMap.putIfAbsent(country, new LinkedHashMap<>());
            countryMap.get(country).putIfAbsent(city, population);
            countries.putIfAbsent(country, 0L);
            countries.put(country, countries.get(country) + population);
            input = scan.nextLine();
        }
        countries.entrySet().stream().sorted(Map.Entry.<String, Long>comparingByValue().reversed()).forEach(country -> {
            System.out.printf("%s (total population: %d)%n", country.getKey(), country.getValue());
            Map<String, Long> cities = countryMap.get(country.getKey());
            cities.entrySet().stream().sorted(Map.Entry.<String, Long>comparingByValue().reversed())
                    .forEach(ct -> System.out.printf("=>%s: %d%n", ct.getKey(), ct.getValue()));

        });
       

    }
}
