package OOP.Polymorphism.WildFarm;

public class Tiger extends Feline {
    private String livingRegionn;

    public Tiger(String animalName, Double animalWeight, Integer foodEaten, String livingRegionn) {
        super(animalName, "Cat", animalWeight, foodEaten);
        this.livingRegionn = livingRegionn;
    }

    @Override
    public void makeSound() {
        System.out.println("ROAAR!!!");
    }

    @Override
    public void eat(Food food) {
        if (food instanceof Meat) {
            setFoodEaten(getFoodEaten() + food.getQuantity());
        } else {
            System.out.println("Tigers are not eating that type of food!");
        }

    }
}
