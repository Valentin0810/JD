package lesson10;

public class Minivan extends Car {

    public Minivan(String brand, String model, int yearOfIssue, int places, String colour) {
        super(brand, model, yearOfIssue, places, colour);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public String toString() {
        return super.toString() + " " + getClass().getSimpleName();
    }
}