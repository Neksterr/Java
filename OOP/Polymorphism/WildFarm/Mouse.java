package OOP.Polymorphism.WildFarm;

public class Mouse extends Mammal{
    public Mouse(String animalName,  Double animalWeight, Integer foodEaten) {
        super(animalName, "Mouse", animalWeight, foodEaten);
    }

    @Override
    public void makeSound() {
        System.out.println("SQUEEEAAAK!");
    }

    @Override
    public void eat(Food food) {
        if (food instanceof Vegetable) {
            setFoodEaten(getFoodEaten() + food.getQuantity());
        } else {
            System.out.println("Mice are not eating that type of food!");
        }    }
}
