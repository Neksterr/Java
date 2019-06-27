import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;
 class Person {

    public String FirstName;
    public String LastName;
    public Date DateOfBirth;
    public String PhoneNumber;
    public  String Email;

    public Person()
    {
        this.FirstName = "0000000000";
        this.LastName = "00000000";
        this.DateOfBirth = ;
        this.PhoneNumber = "000000000";
        this.Email = "00000000000";
    }
    public Person(String FirstName, String LastName, Date DateOfBirth,String PhoneNumber, String Email){

        this.FirstName = FirstName;
        this.LastName = LastName;
        this.DateOfBirth = DateOfBirth;
        this.PhoneNumber = PhoneNumber;
        this.Email = Email;

    }

    public String getFirstName(){return FirstName;}
    public String getLastName() {return LastName;}
    public Date getDateOfBirth(){ return DateOfBirth;}
    public String getPhoneNumber() {return PhoneNumber;}
    public String getEmail() {return Email;}
    public  String toString(){

        String display = "First name: " + FirstName + "\n" + "Last name: " + LastName + "\n" + "Date of birth: " + DateOfBirth + "\n"
                + "Phone number: " + PhoneNumber + "\n" + "Email: " + Email + "\n";

        return display;

    }
    public int compareTo(Person o){
        if(getDateOfBirth() == null || o.getDateOfBirth() == null)
            return 0;
        return getDateOfBirth().compareTo(o.getDateOfBirth());
    }
}
