package lesson7;

public class Triangle extends Figure {

    private Point point1;
    private Point point2;
    private Point point3;
    private double perimeter;

    public Triangle(Point point1, Point point2, Point point3) {
        this.point1 = point1;
        this.point2 = point2;
        this.point3 = point3;
    }

    @Override
    public String getName() {
        return "Triangle";
    }

    @Override
    public double getArea() {
        double sideA = point1.distance(point2);
        double sideB = point2.distance(point3);
        double sideC = point3.distance(point1);
        perimeter = sideA + sideB + sideC;
        return Math.sqrt(perimeter * (perimeter - sideA) * (perimeter - sideB) * (perimeter - sideC));
    }
}