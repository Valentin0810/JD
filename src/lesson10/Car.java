package lesson10;

public abstract class Car {

    private String brand;
    private String model;
    private int yearOfIssue;
    private int places;
    private String colour;

    public Car(String brand, String model, int yearOfIssue, int places, String colour) {
        this.brand = brand;
        this.model = model;
        this.yearOfIssue = yearOfIssue;
        this.places = places;
        this.colour = colour;
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
        return brand + " " + model;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYearOfIssue() {
        return yearOfIssue;
    }

    public void setYearOfIssue(int yearOfIssue) {
        this.yearOfIssue = yearOfIssue;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }
}