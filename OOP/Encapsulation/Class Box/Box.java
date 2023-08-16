package OOP.Encapsulation.ClassBox;

public class Box {
    private double length;
    private double width;
    private double height;

    public Box(double length, double width, double height) {
        this.setLength(length);
        this.setWidth(width);
        this.setHeight(height);
    }

    public void setLength(double length) {
        if(length <= 0){
            throw new IllegalArgumentException("Length cannot be zero or negative.");
        }
        this.length = length;
    }

    public void setWidth(double width) {
        if(width <= 0){
            throw new IllegalArgumentException("Width cannot be zero or negative.");
        }
        this.width = width;
    }

    public void setHeight(double height) {
        if(height <= 0){
            throw new IllegalArgumentException("Height cannot be zero or negative.");
        }
        this.height = height;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public double calculateSurfaceArea(){
//Surface Area = 2lw + 2lh + 2wh
        return (2 * length * width) + (2 * length * height) + (2 * width * height);
    }
    public double calculateLateralSufaceArea(){
//Lateral Surface Area = 2lh + 2wh
        return (2 * length * height) + (2 * width * height);
    }
    public double calculateVolume(){
        //Volume = lwh
        return length * width * height;
    }
}
