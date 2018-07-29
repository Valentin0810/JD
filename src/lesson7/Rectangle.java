package lesson7;

public class Rectangle extends Figure {

    private Point leftUpPoint;
    private Point rightDownPoint;

    public Point getLeftUpPoint() {
        return leftUpPoint;
    }

    public void setLeftUpPoint(Point leftUpPoint) {
        this.leftUpPoint = leftUpPoint;
    }

    public Point getRightDownPoint() {
        return rightDownPoint;
    }

    public void setRightDownPoint(Point rightDownPoint) {
        this.rightDownPoint = rightDownPoint;
    }

    public Rectangle(Point leftUpPoint, Point rightDownPoint) {
        this.leftUpPoint = leftUpPoint;
        this.rightDownPoint = rightDownPoint;
    }

    public double findDiagonal(Rectangle rectangle) {
        return rightDownPoint.distance(leftUpPoint);
    }

    @Override
    public String getName() {
        return "Rectangle";
    }

    @Override
    public double getArea() {
        int width = rightDownPoint.getX() - leftUpPoint.getX();
        int height = leftUpPoint.getY() - rightDownPoint.getY();
        return width * height;
    }
}