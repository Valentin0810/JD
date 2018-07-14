package lesson3;
//Написать программу, вычисляющую сумму цифр введённого
//        пользователем целого числа.


import java.util.Scanner;

public class Task1 {
    public static int sumDigitsInNumber(int number) {

        int sum = 0;
        int digit;
        while (number != 0) {
            digit = number % 10;
            sum = sum + digit;
            number = number / 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        System.out.println(sumDigitsInNumber(number));
    }
}
