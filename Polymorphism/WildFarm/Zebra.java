package OOP.Polymorphism.WildFarm;

public class Zebra extends Mammal{
    public Zebra(String animalName,  Double animalWeight, Integer foodEaten) {
        super(animalName, "Zebra", animalWeight, foodEaten);
    }

    @Override
    public void makeSound() {
        System.out.println("Zs");
    }

    @Override
    public void eat(Food food) {
        if (food instanceof Vegetable) {
            setFoodEaten(getFoodEaten() + food.getQuantity());
        } else {
            System.out.println("Zebras are not eating that type of food!");
        }
    }
}
