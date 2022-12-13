package definingClasses.carInfo;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());
        for (int i = 0; i < n; i++) {

            String[] data = scan.nextLine().split(" ");

            Car car = null;
            if (data.length == 3) {
                String brand = data[0];
                String model = data[1];
                int power = Integer.parseInt(data[2]);
                car = new Car(brand, model, power);
            } else {
                car = new Car(data[0]);
            }
            System.out.println(car.carInfo());
        }

    }
}
