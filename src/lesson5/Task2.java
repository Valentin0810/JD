package lesson5;

import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {
        String[] romanNumbers = {"I", "V", "X", "L", "C", "D", "M"};
        int[] arabicNumbers = {1, 5, 10, 50, 100, 500, 1000};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число в римском формате: ");
        String inputRomanNumber = scanner.next();
        int arabicNumb = 0;
        System.out.println("Число в арабском формате: "
                + convertRomanToArabic(romanNumbers, arabicNumbers, inputRomanNumber, arabicNumb));
    }

    public static int convertRomanToArabic(String[] romanNumbers, int[] arabicNumbers, String inputRomanNumber, int arabicNumb) {
        if (inputRomanNumber.length() > 1) {
            String[] strArray = new String[inputRomanNumber.length()];
            for (int i = 0; i < inputRomanNumber.length(); i++) {
                strArray[i] = Character.toString(inputRomanNumber.charAt(i));
            }
            for (String aStrArray : strArray) {
                for (int j = 0; j < romanNumbers.length; j++) {
                    if (aStrArray.equals(romanNumbers[j])) {
                        arabicNumb += arabicNumbers[j];
                    }
                }
            }
        }
        return arabicNumb;
    }
}