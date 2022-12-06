package setsAndMapsAdv;

import java.util.*;

public class softUniParty {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
       
        TreeSet<String> VipList = new TreeSet<>();
        TreeSet<String> regularList = new TreeSet<>();
        while (!input.equals("PARTY")) {
            if (Character.isDigit(input.charAt(0))) {
                VipList.add(input);
            } else {
                regularList.add(input);
            }
            input = scan.nextLine();
        }
        String guestRes = scan.nextLine();
        while (!guestRes.equals("END")) {

            VipList.remove(guestRes);
            regularList.remove(guestRes);
            guestRes = scan.nextLine();
        }
        System.out.println(VipList.size() + regularList.size());
        for (String guest : VipList) {
            System.out.println(guest);
        }
        for (String guest : regularList) {
            System.out.println(guest);
        }
    }
}
