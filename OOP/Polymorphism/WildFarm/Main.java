package OOP.Polymorphism.WildFarm;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Animal> animals = new ArrayList<>();
        List<Food> foods = new ArrayList<>();
        String input = scan.nextLine();
        while (!input.equals("End")) {
            String[] animalInfo = input.split("\\s+");
            switch (animalInfo[0]) {
                case "Cat" -> {
                    Animal cat = new Cat(animalInfo[1], Double.parseDouble(animalInfo[2]), Integer.parseInt(animalInfo[3]), animalInfo[4]);
                    animals.add(cat);
                }
                case "Mouse" -> {
                    Animal mouse = new Mouse(animalInfo[1], Double.parseDouble(animalInfo[2]), Integer.parseInt(animalInfo[3]));
                    animals.add(mouse);
                }
                case "Zebra" -> {
                    Animal zebra = new Zebra(animalInfo[1], Double.parseDouble(animalInfo[2]), Integer.parseInt(animalInfo[3]));
                    animals.add(zebra);
                }
                case "Tiger" -> {
                    Animal tiger = new Tiger(animalInfo[1], Double.parseDouble(animalInfo[2]), Integer.parseInt(animalInfo[3]), animalInfo[4]);
                    animals.add(tiger);
                }
            }
            String[] foodInfo = input.split("\\s+");
            if (foodInfo[0].equals("Vegetable")) {
                Food veggie = new Vegetable(Integer.parseInt(foodInfo[1]));
                foods.add(veggie);
            } else if (foodInfo[0].equals("Meat")) {
                Food meat = new Meat(Integer.parseInt(foodInfo[1]));
                foods.add(meat);
            }
            input = scan.nextLine();
        }
        for (int i = 0; i < animals.size(); i++) {
            Animal animal = animals.get(i);
            Food food = foods.get(i);
            animal.makeSound();
            animal.eat(food);

            System.out.println(animal.toString());
        }

    }

}
