package OOP.WorkingWithAbstraction.TrafficLight;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<String> colors = Arrays.stream(scan.nextLine().split(" ")).collect(Collectors.toList());
        List<TrafficLight> trafficLights = new ArrayList<>();

        for (String color : colors) {
            Signals currSignal = Signals.valueOf(color);
            TrafficLight currTrafficLight = new TrafficLight(currSignal);
            trafficLights.add(currTrafficLight);
        }
    int n = Integer.parseInt(scan.nextLine());
        for (int i = 0; i < n ; i++){
            for (TrafficLight trafficLight: trafficLights) {
                trafficLight.changeColor();
                System.out.print(trafficLight.getColor() + " ");
            }
            System.out.println();
        }
    }

}
