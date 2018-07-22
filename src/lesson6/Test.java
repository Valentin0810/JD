package lesson6;

public class Test {

    public static void main(String[] args) {
        Point point1 = new Point(1, 6);
        Point point2 = new Point(8, 2);
        System.out.println("Расстояние между точками: " + point2.distance(point1));
        Rectangle rectangle = new Rectangle(point1, point2);
        System.out.println("Диагональ прямоугольника = " + rectangle.findDiagonal(rectangle));
        System.out.println("Площадь прямоугольника = " + rectangle.findArea(rectangle));
    }
}
