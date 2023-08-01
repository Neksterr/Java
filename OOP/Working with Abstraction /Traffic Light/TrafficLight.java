package OOP.WorkingWithAbstraction.TrafficLight;

public class TrafficLight {
    private Signals color;

    public TrafficLight(Signals color) {
        this.color = color;
    }

    public Signals getColor() {
        return color;
    }

    public void changeColor(){
        switch (color){
            case RED:
               this.color = Signals.GREEN;
               break;
            case GREEN:
                this.color = Signals.YELLOW;
                break;
            case YELLOW:
                this.color = Signals.RED;
                break;
        }
    }
}
