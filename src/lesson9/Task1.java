package lesson9;


import java.util.LinkedList;
import java.util.ListIterator;

public class Task1 {
    public static void main(String[] args) {
        LinkedList<String> strings = new LinkedList<>();
        strings.add("this");
        strings.add("is");
        strings.add("lots");
        strings.add("of");
        strings.add("fun");
        strings.add("for");
        strings.add("every");
        strings.add("Java");
        strings.add("Programmer");
        print(strings);
        System.out.println();
        print(markLength4(strings));
    }

    private static <T> void print(Iterable<T> objects) {
        for (T object : objects) {
            System.out.print(" " + object);
        }
    }

    private static LinkedList<String> markLength4(LinkedList<String> list) {
        ListIterator<String> iterator = list.listIterator();
        while (iterator.hasNext()) {
            String currentString;
            currentString = iterator.next();
            if (currentString.length() == 4) {
                iterator.add("****");
            }
        }
        return list;
    }
}