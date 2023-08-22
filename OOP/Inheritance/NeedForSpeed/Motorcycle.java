package OOP.Inheritance.NeedForSpeed;

public class Motorcycle extends Vehicle{
    final static double DEFAULT_FUEL_CONSUMPTION = 8;
    public Motorcycle(double fuel, int horsePower) {
        super(fuel, horsePower);
        setFuelConsumption(DEFAULT_FUEL_CONSUMPTION);
    }
}
