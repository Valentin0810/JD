package lesson6;

public class Rectangle {

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

    public double findArea(Rectangle rectangle) {
        int width = rightDownPoint.getX() - leftUpPoint.getX();
        int height = leftUpPoint.getY() - rightDownPoint.getY();
        return width * height;
    }
}