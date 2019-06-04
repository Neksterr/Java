import java.util.Scanner;

public class FoodDelivery
{

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        double chicken = 10.35;
        double fish = 12.40;
        double veggie = 8.15;

        int numOfChicken = Integer.parseInt(scanner.nextLine());
        int numOfFish = Integer.parseInt(scanner.nextLine());
        int numOfVeggie = Integer.parseInt(scanner.nextLine());

        double priceChicken = numOfChicken * chicken;
        double priceFish = numOfFish * fish;
        double priceVeggie = numOfVeggie * veggie;

        double sum =  priceChicken + priceFish + priceVeggie;

        double desert = sum -(sum * (1 - 0.2));
        double withDelivery = sum + desert + 2.50;

        System.out.printf("Total: %.2f", withDelivery);



    }


}
