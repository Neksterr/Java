package finalPrep;

import java.util.*;

public class plantDiscovery {
    public static class Plant {
        String plant;
        int rarity;
        List<Double> rating;

        public List<Double> getRating() {
            return rating;
        }

        public void setRating(List<Double> rating) {
            this.rating = rating;
        }

        public Plant(String plant, int rarity, List<Double> rating ) {
            this.plant = plant;
            this.rarity = rarity;
            this.rating = rating;
        }

        public String getPlant() {
            return plant;
        }

        public void setPlant(String plant) {
            this.plant = plant;
        }

        public int getRarity() {
            return rarity;
        }

        public void setRarity(int rarity) {
            this.rarity = rarity;
        }

    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        Map<String, Plant> plantMap = new LinkedHashMap<>();

        for (int i = 0; i < n; i++) {
            String[] plantInfo = scan.nextLine().split("<->");
            String name = plantInfo[0];

            int rarityInfo = Integer.parseInt(plantInfo[1]);

            Plant plantObj = new Plant(name, rarityInfo, new ArrayList<>());
            plantObj.getRating().add(0.00);
            plantMap.put(name, plantObj);
        }
        String commandLine = scan.nextLine();
        while (!commandLine.equals("Exhibition")) {
            String[] data = commandLine.split("\\s?[:-]\\s");
            String command = data[0];
            String plant = data[1];

            switch (command) {
                case "Rate":
                    double currRating = Double.parseDouble(data[2]);
                    if (!plantMap.containsKey(plant)) {
                        System.out.println("error");
                    } else {
                        plantMap.get(plant).getRating().add(currRating);
                    }

                    break;
                case "Update":
                    if (!plantMap.containsKey(plant)) {
                        System.out.println("error");
                    } else {
                        plantMap.get(plant).setRarity(Integer.parseInt(data[2]));
                        break;
                    }
                case "Reset":
                if (!plantMap.containsKey(plant)) {
                    System.out.println("error");
                } else {

                    plantMap.get(plant).getRating().clear();
                    plantMap.get(plant).getRating().add(0.00);

                }
                    break;
            }
            commandLine = scan.nextLine();
        }
        System.out.println("Plants for the exhibition:");
        plantMap.forEach((k,v) -> {
            double sum = 0;
            for(int i = 0;i < v.getRating().size() ;i++){
                sum += v.getRating().get(i);
            }
            double avrRating = 0;
            if(v.getRating().size() > 1){
                avrRating = sum / (v.getRating().size() - 1);
            } else {
                avrRating = sum / (v.getRating().size() );
            }
            System.out.printf("- %s; Rarity: %d; Rating: %.2f%n", v.getPlant(), v.getRarity(), avrRating);
        });
    }
}
