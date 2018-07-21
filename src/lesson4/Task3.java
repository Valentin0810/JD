package lesson4;

import java.util.Arrays;

public class Task3 {

    public static void main(String[] args) {
        int[] firstArray = {1, 2, 3, 4, 5};
        int[] secondArray = {5, 6, 7};
        System.out.print(Arrays.toString(mergeArrays(firstArray, secondArray)));
    }

    public static int[] mergeArrays(int[] firstArray, int[] secondArray) {
        int[] mergeArray = new int[firstArray.length + secondArray.length];
        for (int i = 0; i < mergeArray.length; i++) {
            if (i < firstArray.length && i < secondArray.length) {
                mergeArray[i + i] = firstArray[i];
                mergeArray[i + i + 1] = secondArray[i];
            } else if (i < firstArray.length && i == secondArray.length) {
                mergeArray[i + i] = firstArray[i];
                mergeArray[i + i + 1] = firstArray[i + 1];
            } else if (i < secondArray.length && i == firstArray.length) {
                mergeArray[i + i] = secondArray[i];
                mergeArray[i + i + 1] = secondArray[i + 1];
            }
        }
        return mergeArray;
    }
}












