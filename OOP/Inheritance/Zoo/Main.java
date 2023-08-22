package OOP.Inheritance.Zoo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String name = sc.nextLine();


        Bear bear = new Bear(name);
        Gorilla gorilla = new Gorilla(name);
        Reptile reptile = new Reptile(name);
        Snake snake = new Snake(name);
        System.out.println(bear.getName());
        System.out.println(gorilla.getName());
        System.out.println(snake.getName());
        System.out.println(reptile.getName());




    }
}
