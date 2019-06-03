import java.util.Scanner;

public class BirthDay
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        double legth = Double.parseDouble(scanner.nextLine());
        double wight = Double.parseDouble(scanner.nextLine());
        double height = Double.parseDouble(scanner.nextLine());
        double sandP = Double.parseDouble(scanner.nextLine());

        double water = 0.001;

        double volume = legth * wight * height;
        double neededWater = volume * water;

        sandP = sandP *0.01;

        double total = neededWater * (1 - sandP);

        System.out.printf("%.3f", total);

    }

}
