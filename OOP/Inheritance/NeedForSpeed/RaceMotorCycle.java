package OOP.Inheritance.NeedForSpeed;



public class RaceMotorCycle extends Motorcycle {
    public RaceMotorCycle(double fuel, int horsePower) {
        super(fuel, horsePower);
        setFuelConsumption(DEFAULT_FUEL_CONSUMPTION);
    }
}
