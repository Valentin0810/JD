package lesson3;

//Написать программу, вычисляющую и отображающую все числа
//        Фибоначчи меньше введённого пользователем целого числа.
//        Решить двумя способами: с помощью цикла и с помощью
//        рекурсии.


import java.util.Scanner;

public class Task2rec {
    private static long fibonachi(long n) {
        if (n <= 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else if (n == 2) {
            return 1;
        } else {
            return fibonachi(n - 1) + fibonachi(n - 2);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextInt();
        for (long i = 1; fibonachi(i) <= n; i++) {
            System.out.print(fibonachi(i) + " ");
        }
    }            }


