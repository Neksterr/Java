package OOP.WorkingWithAbstraction.PointInRectangle;
import java.util.*;
public class Rectangle {
    private Point bottomLeft;
    private Point topRight;
    public Rectangle(Point bottomLeft, Point topRight) {
        this.bottomLeft = bottomLeft;
        this.topRight = topRight;
    }

    public boolean contains( Point point ){
        return point.isGreaterorEqual(bottomLeft) && point.isLessrorEqual(topRight);
    }

}
