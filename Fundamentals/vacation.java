import java.util.Scanner;
public class Vacation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numOfPeople = Integer.parseInt(scan.nextLine());
        String group = scan.nextLine();
        String day = scan.nextLine();
        double sum = 0;
        if(numOfPeople >= 30 && group.equals("Students") ) {
            if(day.equals("Friday"))
            {
                sum = numOfPeople * 8.45;
                double total = sum - (sum * 0.15) ;
                System.out.printf("Total price: %.2f", total);
            } else if(day.equals("Saturday") ) {
                sum = numOfPeople * 9.80;
                double total = sum - (sum * 0.15) ;
                System.out.printf("Total price: %.2f", total);
            } else if(day.equals("Sunday") ) {
                sum = numOfPeople * 10.46;
                double total = sum - (sum * 0.15) ;
                System.out.printf("Total price: %.2f", total);
            }
        } else if (numOfPeople < 30 && group.equals("Students")) {
            if(day.equals("Friday") )
            {
                sum = numOfPeople * 8.45;

                System.out.printf("Total price: %.2f", sum);
            } else if(day.equals("Saturday")) {
                sum = numOfPeople * 9.80;

                System.out.printf("Total price: %.2f", sum);
            } else if(day.equals("Sunday")) {
                sum = numOfPeople * 10.46;

                System.out.printf("Total price: %.2f", sum);
            }
        }
//----------------------------------------------------------
        if(numOfPeople >= 100 && group.equals("Business") ) {
            if(day.equals("Friday"))
            {
                sum = (numOfPeople - 10) * 10.90;

                System.out.printf("Total price: %.2f", sum);
            } else if(day.equals("Saturday") ) {
                sum = (numOfPeople - 10) * 15.60;

                System.out.printf("Total price: %.2f", sum);
            } else if(day.equals("Sunday") ) {
                sum = (numOfPeople -10) * 16;
                System.out.printf("Total price: %.2f", sum);
            }
        } else if (numOfPeople < 100 && group.equals("Business")) {
            if(day.equals("Friday") )
            {
                sum = numOfPeople * 10.90;

                System.out.printf("Total price: %.2f", sum);
            } else if(day.equals("Saturday")) {
                sum = numOfPeople * 15.60;

                System.out.printf("Total price: %.2f", sum);
            } else if(day.equals("Sunday")) {
                sum = numOfPeople * 16;

                System.out.printf("Total price: %.2f", sum);
            }
        }
        //------------------------------------------
        if(numOfPeople >= 10 && numOfPeople <= 20 && group.equals("Regular") ) {
            if(day.equals("Friday"))
            {
                sum = numOfPeople * 15;
                double total = sum - (sum * 0.05) ;
                System.out.printf("Total price: %.2f", total);
            } else if(day.equals("Saturday") ) {
                sum = numOfPeople * 20;
                double total = sum - (sum * 0.05) ;
                System.out.printf("Total price: %.2f", total);
            } else if(day.equals("Sunday") ) {
                sum = numOfPeople * 22.50;
                double total = sum - (sum * 0.05) ;
                System.out.printf("Total price: %.2f", total);
            }
        } else if (group.equals("Regular")) {
            if(day.equals("Friday") )
            {
                sum = numOfPeople * 15;

                System.out.printf("Total price: %.2f", sum);
            } else if(day.equals("Saturday")) {
                sum = numOfPeople * 20;

                System.out.printf("Total price: %.2f", sum);
            } else if(day.equals("Sunday")) {
                sum = numOfPeople * 22.50;

                System.out.printf("Total price: %.2f", sum);
            }
        }
    }
}
