package lesson4;

import java.util.Arrays;

public class Task1 {

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7};
        System.out.println(Arrays.toString(array));
        moveElementsRight(array);
    }

    public static void moveElementsRight(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                int temp = array[j];
                array[j] = array[i];
                array[i] = temp;
            }
            System.out.println(Arrays.toString(array));
        }
    }
}