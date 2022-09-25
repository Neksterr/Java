package MidExam;

import java.util.*;

public class computerStore {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String command = scan.nextLine();
        double total = 0;
        double totalWithoutTaxes = 0;
        double taxes = 0;
        while (!command.equals("special") && !command.equals("regular")) {
            double price = Double.parseDouble(command);
            if (price < 0) {
                System.out.println("Invalid price!");
                command = scan.nextLine();
            } else if (price == 0) {
                System.out.println("Invalid order!");
                command = scan.nextLine();
            } else {
                taxes = taxes + (price * 0.2);
                totalWithoutTaxes += price;

                command = scan.nextLine();
            }
        }
        total = totalWithoutTaxes + taxes;
        if(total == 0){
            System.out.println("Invalid order!");
        }

        else if (command.equals("special")) {
            total = total - (total * 0.1);
            System.out.printf(
                    "Congratulations you've just bought a new computer!\n Price without taxes: %.2f$\n Taxes: %.2f$\n -----------\n Total price: %.2f$\n",
                    totalWithoutTaxes, taxes, total);
        } else{
            System.out.printf(
                    "Congratulations you've just bought a new computer!\n Price without taxes: %.2f$\n Taxes: %.2f$\n -----------\n Total price: %.2f$\n",
                    totalWithoutTaxes, taxes, total);
        }
    }
}
