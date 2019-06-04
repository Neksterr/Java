import java.util.Scanner;

public class Safari
{

    public static void main(String[] args)
    {

        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        double fuel = Double.parseDouble(scanner.nextLine());
        String day = scanner.nextLine();

        double priceOfFuel = 2.10;
        double tourGuide = 100;

        double getFuel = fuel * priceOfFuel;
        double withGuide = getFuel + tourGuide;

        if(day.equals("Sunday"))
        {
            double sum = withGuide * (1 - 0.2);
            if (budget >= sum)
            {
                double left = budget - sum;
                System.out.printf("Safari time! Money left: %.2f lv.",left);
            }
            else
            {
                double need = sum - budget;
                System.out.printf("Not enough money! Money needed: %.2f lv.",need);
            }
        }

        else if(day.equals("Saturday"))
        {
            double sum = withGuide * (1 - 0.1);
            if (budget >= sum)
            {
                double left = budget - sum;
                System.out.printf("Safari time! Money left: %.2f lv.",left);
            }
            else
            {
                double need = sum - budget;
                System.out.printf("Not enough money! Money needed: %.2f lv.",need);
            }
        }


    }


}
