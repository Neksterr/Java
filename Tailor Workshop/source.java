import java.util.Scanner;

public class TailorWorkshop
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        int numOfTables = Integer.parseInt(scanner.nextLine());
        double legthOftheTable = Double.parseDouble(scanner.nextLine());
        double wightOfTheTable = Double.parseDouble(scanner.nextLine());
        double BGN = 1.85;

        double areaOfAll = numOfTables * ( legthOftheTable + 2 * 0.30) * (wightOfTheTable + 2 * 0.30);
        double loin = numOfTables * (legthOftheTable / 2)*(legthOftheTable/2);

        double priceInUSD = areaOfAll * 7 + loin * 9;
        double priceInBGN = priceInUSD * BGN;

        System.out.printf("%.2f",priceInUSD  );
        System.out.println("");
        System.out.printf("%.2f",priceInBGN );




    }

}
