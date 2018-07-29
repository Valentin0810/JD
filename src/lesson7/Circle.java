package lesson7;

public class Circle extends Figure {

    private Point point1;
    private Point point2;
    private double radius;

    public Circle(Point point1, Point point2) {
        this.point1 = point1;
        this.point2 = point2;
    }

    @Override
    public String getName() {
        return "Circle";
    }

    @Override
    public double getArea() {
        radius = point1.distance(point2);
        return Math.PI * radius * radius;
    }
}