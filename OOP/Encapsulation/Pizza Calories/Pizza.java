package OOP.Encapsulation.PizzaCalories;

import java.util.ArrayList;
import java.util.List;

public class Pizza {
    private String name;
    private Dough dought;
    private List<Topping> toppings;

    public Pizza(String name, int numberOfToppings) {
        this.setName(name);
        this.setToppings(numberOfToppings);
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name == null || name.trim().isEmpty() || name.length() > 15) {
            throw new IllegalArgumentException("Pizza name should be between 1 and 15 symbols.");
        }
        this.name = name;
    }

    public Dough getDought() {
        return dought;
    }

    public void setDought(Dough dought) {
        this.dought = dought;
    }

    public List<Topping> getToppings() {
        return toppings;
    }

    public void setToppings(int numberOfToppings) {
        if (numberOfToppings < 0 || numberOfToppings > 10) {
            throw new IllegalArgumentException("Number of toppings should be in range [0..10].");
        }
        this.toppings = new ArrayList<>();
    }

    public void addTopping(Topping topping) {
        this.toppings.add(topping);
    }

    public double getOverallCalories() {
        double toppingCal = this.toppings.stream().map(Topping::calculateCalories).mapToDouble(Double::doubleValue).sum();
        return dought.calculateCalories() + toppingCal;
    }
}
