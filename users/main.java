import java.sql.Array;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.*;

public class Main {

    static void PrintAll(int count, List<Person> people)
    {
        for(int i = 0; i < count; i++)
        {
            System.out.print(people.get(i));
        }
        System.out.println();

    }

    static void SortDate(List<Person> people)
    {

        Collections.sort(people, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                if(o1.getDateOfBirth() == null || o2.getDateOfBirth() == null)
                return 0;

             return o1.getDateOfBirth().compareTo(o2.getDateOfBirth());
            }
        });
    }
    static void AddUser()
    {
        Scanner scanner = new Scanner(System.in);



        List<Person> people = new ArrayList<Person>();

        do {
            Person p = new Person();
            p.FirstName = scanner.nextLine();
            p.LastName = scanner.nextLine();
            p.DateOfBirth = scanner.nextLine();
            p.PhoneNumber = scanner.nextLine();
            p.Email = scanner.nextLine();

            people.add(p);
            System.out.print(p.toString());
        }while(people.size()!= 0);
    }

    public  static void main (String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        int click = Integer.parseInt(scanner.nextLine());

        switch (click)
        {
            case 0 : AddUser(); break;
            case 1: PrintAll(); break;
        }

    }


}
