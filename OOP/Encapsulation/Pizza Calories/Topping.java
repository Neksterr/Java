package OOP.Encapsulation.PizzaCalories;

public class Topping {
    private String toppingType;
    private double weight;

    public Topping(String toppingType, double weight) {
        this.setToppingType(toppingType);
        this.setWeight(weight);
    }

    public String getToppingType() {
        return toppingType;
    }

    public void setToppingType(String toppingType) {
        if (!toppingType.equals("Meat") && !toppingType.equals("Veggies") && !toppingType.equals("Cheese")&& !toppingType.equals("Sauce")) {
            throw new IllegalArgumentException("Invalid type of topping.");
        }
        this.toppingType = toppingType;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        if (weight > 50 || weight < 1) {
            throw new IllegalArgumentException(toppingType + " weight should be in the range [1..50].");
        }
        this.weight = weight;
    }

    private double getToppingModifier() {
        switch (toppingType) {
            case "Meat":
                return 1.2;
            case "Veggies":
                return 0.8;
            case "Cheese":
                return 1.1;
            case "Sauce":
                return 0.9;

        }
        return 0;
    }

    public double calculateCalories() {


        return (weight * 2) * getToppingModifier();
    }
}
