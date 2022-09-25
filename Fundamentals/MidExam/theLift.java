package MidExam;

import java.util.*;
import java.util.stream.Collectors;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class theLift {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int waitingPeople = Integer.parseInt(scan.nextLine());
        List<Integer> lift = Arrays.stream(scan.nextLine().split(" ")).map(Integer::parseInt)
                .collect(Collectors.toList());
        for (int i = 0; i < lift.size(); i++) {
            if (waitingPeople < 1) {
                break;
            }
            while (lift.get(i) < 4) {
                if (waitingPeople < 1) {
                    break;
                } else {
                    lift.set(i, lift.get(i) + 1);
                    waitingPeople--;
                }
            }
        }
        if (waitingPeople < 1) {
            System.out.println("The lift has empty spots!");
        } else {
            System.out.printf("There isn't enough space! %d people in a queue!%n", waitingPeople);
        }
        System.out.println(lift.toString().replaceAll("[\\[\\],]", ""));

    }
}
