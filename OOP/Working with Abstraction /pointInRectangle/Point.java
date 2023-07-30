package OOP.WorkingWithAbstraction.PointInRectangle;
import  java.util.*;
public class Point {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
    public boolean isGreaterorEqual(Point other){
        return this.getX() >= other.getX() && this.getY() >= other.getY();
    }
    public boolean isLessrorEqual(Point other){
        return this.getX() <= other.getX() && this.getY() <= other.getY();
    }
}
