package lesson4;

import java.util.Arrays;

public class Task2 {

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 4, 5, 6, 7, 8, 8, 4, 3, 0, 9};
        System.out.println(Arrays.toString(array));
        dellRepeatedValues(array);
        System.out.println(Arrays.toString(array));
    }

    public static void dellRepeatedValues(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++)
                if (array[i] == array[j]) {
                    array[j] = 0;
                }
        }
    }
}


