package finalPrep;

import java.util.*;

public class needForSpeed {
    public static class Car {
        String car;
        int mileage;
        int fuel;

        public Car(String car, int mileage, int fuel) {
            this.car = car;
            this.mileage = mileage;
            this.fuel = fuel;

        }

        public String getCar() {
            return car;
        }

        public int getMileage() {
            return mileage;
        }

        public int getFuel() {
            return fuel;
        }

        public void setCar(String car) {
            this.car = car;
        }

        public void setMileage(int mileage) {
            this.mileage = mileage;
        }

        public void setFuel(int fuel) {
            this.fuel = fuel;
        }

    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        Map<String, Car> carMap = new LinkedHashMap<>();
        for (int i = 0; i < n; i++) {
            String[] carInfo = scan.nextLine().split("\\|");
            String model = carInfo[0];
            int carMileage = Integer.parseInt(carInfo[1]);
            int carFuel = Integer.parseInt(carInfo[2]);
            Car car = new Car(model, carMileage, carFuel);
            carMap.put(model, car);

        }
        String commandLine = scan.nextLine();
        while (!commandLine.equals("Stop")) {
            String[] data = commandLine.split(" : ");
            String command = data[0];
            String name = data[1];
            switch (command) {
                case "Drive":
                    // • "Drive : {car} : {distance} : {fuel}":

                    int distance = Integer.parseInt(data[2]);
                    int fuel1 = Integer.parseInt(data[3]);
                    if (carMap.get(name).fuel < fuel1) {
                        System.out.println("Not enough fuel to make that ride");
                    } else {
                        carMap.get(name).setMileage(carMap.get(name).getMileage() + distance);
                        carMap.get(name).setFuel(carMap.get(name).getFuel() - fuel1);
                        System.out.printf("%s driven for %d kilometers. %d liters of fuel consumed.", name,distance,fuel1);
                    }
                    if (carMap.get(name).getMileage() >= 100000) {
                        carMap.remove(name);
                        System.out.printf("Time to sell the %s!%n", name);
                    }
                    break;

                case "Refuel":
                    // • "Refuel : {car} : {fuel}":
                    int fuelRefill = Integer.parseInt(data[1]);
                    if(carMap.get(name).fuel + fuelRefill < 75){
                        System.out.printf("%s refueled with %d liters%n"
                                , name, 75 - carMap.get(name).getFuel());
                        carMap.get(name).setFuel(75);
                    } else {
                        carMap.get(name).setFuel(carMap.get(name).getFuel() + fuelRefill);
                        System.out.printf("%s refueled with %d liters%n", name, fuelRefill);

                    }
                    break;

                case "Revert":
                    // • "Revert : {car} : {kilometers}":
                    int revertMileage = Integer.parseInt(data[1]);
                    if(carMap.get(name).mileage - revertMileage > 10000){
                        carMap.get(name).setMileage(carMap.get(name).getMileage() - revertMileage);
                        System.out.printf("%s mileage decreased by %d kilometers%n", name, revertMileage);
                        
                        
                    } else {
                        carMap.get(name).setMileage(10000);

                    }
                    break;

            }

            commandLine = scan.nextLine();
        }
        carMap.forEach((k, v) ->
                System.out.printf("%s -> Mileage: %d kms, Fuel in the tank: %d lt.%n"
                        , v.car, v.mileage, v.fuel));
    }
}
