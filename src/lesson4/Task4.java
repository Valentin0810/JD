package lesson4;

import java.util.Arrays;

public class Task4 {

    public static void main(String[] args) {
        int[][] array = {
                {1, 2, 3, 4, 5},
                {6, 7, 8, 9, 0}};
        int[] newarray = linearize(array);
        System.out.println('\n' + Arrays.toString(newarray));
    }

    public static int countElementsArray(int[][] array) {
        int result = 0;
        for (int[] i : array) {
            result += i.length;
        }
        return result;
    }

    public static int[] linearize(int[][] array) {
        int[] newarray = new int[countElementsArray(array)];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + "\t");
                newarray[i * (array[i].length) + j] = array[i][j];
            }
            System.out.println();
        }
        return newarray;
    }
}




