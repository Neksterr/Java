package OOP.InterfacesAndAbstraction.Telephony;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<String> phoneNumbers = Arrays.stream(scan.nextLine().split("\\s+")).collect(Collectors.toList());
        List<String> sitesToVisit = Arrays.stream(scan.nextLine().split("\\s+")).collect(Collectors.toList());
        Smartphone smartphone = new Smartphone(phoneNumbers, sitesToVisit);


        System.out.println(smartphone.call());
        System.out.println(smartphone.browse());


    }
}
