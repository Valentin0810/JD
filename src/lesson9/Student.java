package lesson9;

public class Student {
    private String firstName;
    private String lastName;
    private int age;
    private double averageRatingOfTheYear;

    public Student(String firstName, String lastName, int age, double averageRatingOfTheYear) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.averageRatingOfTheYear = averageRatingOfTheYear;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getAverageRatingOfTheYear() {
        return averageRatingOfTheYear;
    }

    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age + ", averageRatingOfTheYear=" + averageRatingOfTheYear +
                '}';
    }

    public void setAverageRatingOfTheYear(double averageRatingOfTheYear) {
        this.averageRatingOfTheYear = averageRatingOfTheYear;
    }
}