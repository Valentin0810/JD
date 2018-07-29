package lesson9;

import java.util.*;

public class GradesStudents {
    public static void main(String[] args) {
        List<Student> students = Arrays.asList(
                new Student("Денис", "Абрамович", 20, 2.6),
                new Student("Никита", "Базекин", 19, 0.0),
                new Student("Валентин", "Варвашевич", 31, 8.0),
                new Student("Александр", "Гордич", 25, 5.0),
                new Student("Валерий", "Дорожинский", 35, 0.0),
                new Student("Евгений", "Дубин", 26, 8.2),
                new Student("Алексей", "Жук", 28, 9.0));
        print(students);
        students.sort(Comparator.comparing(Student::getFirstName)
                .thenComparing(Comparator.comparing(Student::getLastName)));
        print(students);
        students.sort(new AgeComparator());
        print(students);
        students.sort(new RatingComparator());
        print(students);
    }

    private static void print(List<Student> students) {
        for (Student student : students) {
            System.out.println(student);
        }
        System.out.println();
    }

    private static <Student> void printBestStudent(Iterable<Student> objects) {
        Iterator<Student> iterator = objects.iterator();
        while (iterator.hasNext()) {
            Student next = iterator.next();

            System.out.println(next);
        }
    }
}