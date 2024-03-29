package OOP.Inheritance.Animals;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        while(!input.equals("Beast!")){
            String[] animalInfo = scan.nextLine().split(" ");

            String name = animalInfo[0];

            int age = Integer.parseInt(animalInfo[1]);

            String gender = animalInfo[2];

            try{
                switch (input){
                    case"Cat":
                        Cat cat = new Cat(name, age, gender);
                        System.out.println(cat);
                        break;
                    case"Frog":
                        Frog frog = new Frog(name, age, gender);
                        System.out.println(frog);
                        break;
                    case"Dog":
                        Dog dog = new Dog(name, age, gender);
                        System.out.println(dog);
                        break;
                    case"Kitten":
                        Kittens kitten = new Kittens(name, age);
                        System.out.println(kitten);
                        break;
                    case"Tomcat":
                        Tomcat tomcat = new Tomcat(name, age);
                        System.out.println(tomcat);
                        break;
                }
            } catch (IllegalArgumentException e){
                System.out.println(e.getMessage());
            }
            input = scan.nextLine();
        }
    }
}
