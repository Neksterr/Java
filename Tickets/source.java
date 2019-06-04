import java.util.Scanner;

public class Tickets
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String category = scanner.nextLine();
        int numOfPeople= Integer.parseInt(scanner.nextLine());

        double vipTicket = 499.99;
        double normalTicket = 249.99;

        if (numOfPeople <= 4)
        {
            double transport = budget *(1 - 0.75);

            if (category.equals("Normal")) {
                double sum = numOfPeople * normalTicket;
                if (transport > sum) {
                    double total = transport - sum;
                    System.out.printf("Yes! You have %.2f leva left" , total);
                } else {
                    double total = sum - transport;
                    System.out.printf("Not enough money! You need %.2f leva" , total);
                }
            } else if (category.equals("VIP")) {
                double sum = numOfPeople * vipTicket;
                if (transport > sum) {
                    double total = transport - sum;
                    System.out.printf("Yes! You have %.2f leva left ",total);
                } else {
                    double total = sum - transport;
                    System.out.printf("Not enough money! You need %.2f leva" ,total );
                }
            }
        }

        if (numOfPeople <= 9 && numOfPeople>= 5) {
            double transport = budget * (1 - 0.60);

            if (category.equals("Normal")) {
                double sum = numOfPeople * normalTicket;
                if (transport > sum) {
                    double total = transport - sum;
                    System.out.printf("Yes! You have %.2f leva left" , total);
                } else {
                    double total = sum - transport;
                    System.out.printf("Not enough money! You need %.2f leva" , total);
                }
            } else if (category.equals("VIP")) {
                double sum = numOfPeople * vipTicket;
                if (transport > sum) {
                    double total = transport - sum;
                    System.out.printf("Yes! You have %.2f leva left ",total);
                } else {
                    double total = sum - transport;
                    System.out.printf("Not enough money! You need %.2f leva" ,total );
                }
            }
        }

        if (numOfPeople <= 24 && numOfPeople >= 10) {
            double transport = budget * (1 - 0.50);

            if (category.equals("Normal")) {
                double sum = numOfPeople * normalTicket;
                if (transport > sum) {
                    double total = transport - sum;
                    System.out.printf("Yes! You have %.2f leva left" , total);
                } else {
                    double total = sum - transport;
                    System.out.printf("Not enough money! You need %.2f leva" , total);
                }
            } else if (category.equals("VIP")) {
                double sum = numOfPeople * vipTicket;
                if (transport > sum) {
                    double total = transport - sum;
                    System.out.printf("Yes! You have %.2f leva left ",total);
                } else {
                    double total = sum - transport;
                    System.out.printf("Not enough money! You need %.2f leva" ,total );
                }
            }
        }

        if (numOfPeople <= 49 && numOfPeople >= 25) {
            double transport = budget * (1 - 0.40);

            if (category.equals("Normal")) {
                double sum = numOfPeople * normalTicket;
                if (transport > sum) {
                    double total = transport - sum;
                    System.out.printf("Yes! You have %.2f leva left" , total);
                } else {
                    double total = sum - transport;
                    System.out.printf("Not enough money! You need %.2f leva" , total);
                }
            } else if (category.equals("VIP")) {
                double sum = numOfPeople * vipTicket;
                if (transport > sum) {
                    double total = transport - sum;
                    System.out.printf("Yes! You have %.2f leva left ",total);
                } else {
                    double total = sum - transport;
                    System.out.printf("Not enough money! You need %.2f leva" ,total );
                }
            }
        }

        if ( numOfPeople >= 50) {
            double transport = budget * (1 - 0.25);

            if (category.equals("Normal")) {
                double sum = numOfPeople * normalTicket;
                if (transport > sum) {
                    double total = transport - sum;
                    System.out.printf("Yes! You have %.f2 leva left" , total);
                } else {
                    double total = sum - transport;
                    System.out.printf("Not enough money! You need %.2f leva" , total);
                }
            } else if (category.equals("VIP")) {
                double sum = numOfPeople * vipTicket;
                if (transport > sum) {
                    double total = transport - sum;
                    System.out.printf("Yes! You have %.2f leva left ",total);
                } else {
                    double total = sum - transport;
                    System.out.printf("Not enough money! You need %.2f leva" ,total );
                }
            }
        }
    }
}
