package OOP.Inheritance.NeedForSpeed;

public class SportsCar extends Car{
    final static double DEFAULT_FUEL_CONSUMPTION = 10;
    public SportsCar(double fuel, int horsePower) {

        super(fuel, horsePower);
        setFuelConsumption(DEFAULT_FUEL_CONSUMPTION);
    }
}
