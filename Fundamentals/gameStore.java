package Fundamentals.Basic;
import java.util.*;
public class gamingStore {
    public static void main(String[] args) {
        /*      OutFall 4 $39.99
                CS: OG $15.99
                Zplinter Zell $19.99
                Honored 2 $59.99
                RoverWatch $29.99
                RoverWatch Origins Edition $39.99    */


                Scanner scan = new Scanner(System.in);
                double sum = 0;
                double balance = Double.parseDouble(scan.nextLine());
                String command = scan.nextLine();

                while (!command.equals("Game Time")) {
                    double gamePrice = 0.0;

                    switch (command) {
                        case "OutFall 4":
                            gamePrice = 39.99;
                            if (checkBalance(balance, gamePrice)) {
                                System.out.println("Bought OutFall 4");
                                sum += gamePrice;
                                balance -= gamePrice;

                            }
                            break;
                        case "CS: OG":
                            gamePrice = 15.99;
                            if (checkBalance(balance, gamePrice)) {
                                System.out.println("Bought CS: OG");
                                sum += gamePrice;
                                balance -= gamePrice;

                            }
                            break;
                        case "Zplinter Zell":
                            gamePrice = 19.99;
                            if (checkBalance(balance, gamePrice)) {
                                System.out.println("Bought Zplinter Zell");
                                sum += gamePrice;
                                balance -= gamePrice;

                            }
                            break;
                        case "Honored 2":
                            gamePrice = 59.99;
                            if (checkBalance(balance, gamePrice)) {
                                System.out.println("Bought Honored 2");
                                sum += gamePrice;
                                balance -= gamePrice;

                            }
                            break;
                        case "RoverWatch":
                            gamePrice = 29.99;
                            if (checkBalance(balance, gamePrice)) {
                                System.out.println("Bought RoverWatch");
                                sum += gamePrice;
                                balance -= gamePrice;

                            }
                            break;
                        case "RoverWatch Origins Edition":
                            gamePrice = 39.99;
                            if (checkBalance(balance, gamePrice)) {
                                System.out.println("Bought RoverWatch Origins Edition");
                                sum += gamePrice;
                                balance -= gamePrice;

                            }
                            break;
                        default:
                            System.out.println("Not Found");
                            break;
                    }

                    if (balance <= 0) {
                        System.out.println("Out of money!");
                        break;
                    } else {
                        command = scan.nextLine();
                    }


                }
    if(balance != 0){
                System.out.printf("Total spent: $%.2f. Remaining: $%.2f", sum, balance);
            }}

            public static boolean checkBalance(double balance, double gamePrice) {
                if (balance <= 0) {
                    System.out.println("Out of money!");
                    return false;
                } else if (balance < gamePrice) {
                    System.out.println("Too Expensive");
                    return false;
                }

                return true;
            }
        }
