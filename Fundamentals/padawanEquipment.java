package basic;
import java.util.*;;
public class padawanEquipment {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        double amountMoney = Double.parseDouble(scan.nextLine());
        int countStudents = Integer.parseInt(scan.nextLine());
        double priveLightsabers = Double.parseDouble(scan.nextLine());
        double priceRobes = Double.parseDouble(scan.nextLine());
        double priceBelts = Double.parseDouble(scan.nextLine());
        double sum = 0;
        sum = priveLightsabers * (countStudents + Math.ceil(countStudents * 0.1)) + priceRobes * countStudents + priceBelts  * (countStudents - (countStudents / 6));
        if(sum <= amountMoney){
            System.out.printf("The money is enough - it would cost %.2flv.",sum);
        } else{
            double more = sum - amountMoney;
            System.out.printf("George Lucas will need %.2flv more.",more);

        }





    }
    
}
