package lesson7;

public abstract class Figure {

    private String name;
    private double area;

    public abstract String getName();

    public abstract double getArea();

    public void comparesAreaFigure(Figure figure) {
        if (this.getArea() > figure.getArea()) {
            System.out.println(this.getName() + " больше " + figure.getName());
        } else {
            System.out.println(figure.getName() + " больше " + this.getName());
        }
    }
}