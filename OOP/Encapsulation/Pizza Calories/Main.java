package OOP.Encapsulation.PizzaCalories;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] input = scan.nextLine().split(" ");
        String namePizza = input[1];
        int numOfToppings = Integer.parseInt(input[2]);
        try {
            Pizza pizza = new Pizza(namePizza, numOfToppings);
            String[] inputDought = scan.nextLine().split(" ");
            String flourDought = inputDought[1];
            String bakingrDought = inputDought[2];
            int weightInGrams = Integer.parseInt(inputDought[3]);
            Dough dough = new Dough(flourDought,bakingrDought,weightInGrams);
            pizza.setDought(dough);
            String inputToppings = scan.nextLine();
            while(!inputToppings.equals("END")){
                String[] infoToppings = inputToppings.split("\\s+");
                String toppingType = infoToppings[1];

                double toppinWeight = Double.parseDouble(infoToppings[2]);
                Topping topping = new Topping(toppingType,toppinWeight);
                pizza.addTopping(topping);
                inputToppings = scan.nextLine();
            }
            System.out.printf("%s - %.2f", pizza.getName(), pizza.getOverallCalories());
        }  catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }


    }
}
