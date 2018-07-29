package lesson7;

public class ShapeUtils {
    public static void main(String[] args) {
        Point leftDown = new Point(1, 1);
        Point leftUp = new Point(1, 3);
        Point point3 = new Point(3, 6);
        Square square = new Square(leftDown, leftUp);
        Triangle triangle = new Triangle(leftDown, leftUp, point3);
        Circle circle = new Circle(point3, leftUp);
        circle.comparesAreaFigure(square);
        Rectangle rectangle = new Rectangle(leftUp, point3);
    }
}