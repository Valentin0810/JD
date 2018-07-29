package lesson7;

public class Square extends Figure {

    private Point leftUpPoint;
    private Point leftDownPoint;

    public Square(Point leftUpPoint, Point leftDownPoint) {
        this.leftUpPoint = leftUpPoint;
        this.leftDownPoint = leftDownPoint;
    }

    @Override
    public String getName() {
        return "Square";
    }

    @Override
    public double getArea() {
        return Math.pow(leftDownPoint.distance(leftUpPoint), 2);
    }

    public Point getLeftUpPoint() {
        return leftUpPoint;
    }

    public void setLeftUpPoint(Point leftUpPoint) {
        this.leftUpPoint = leftUpPoint;
    }

    public Point getLeftDownPoint() {
        return leftDownPoint;
    }

    public void setLeftDownPoint(Point leftDownPoint) {
        this.leftDownPoint = leftDownPoint;
    }
}