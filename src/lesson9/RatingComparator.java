package lesson9;


import java.util.Comparator;

public class RatingComparator implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        return Double.compare(o1.getAverageRatingOfTheYear(), o2.getAverageRatingOfTheYear());
    }
}