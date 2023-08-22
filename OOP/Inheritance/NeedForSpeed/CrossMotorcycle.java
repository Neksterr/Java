package OOP.Inheritance.NeedForSpeed;

public class CrossMotorcycle extends Motorcycle{
    public CrossMotorcycle(double fuel, int horsePower) {
        super(fuel, horsePower);
        setFuelConsumption(DEFAULT_FUEL_CONSUMPTION);
    }
}
