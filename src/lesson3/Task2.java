package lesson3;
//Написать программу, вычисляющую и отображающую все числа
//        Фибоначчи меньше введённого пользователем целого числа.
//        Решить двумя способами: с помощью цикла и с помощью
//        рекурсии.


import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int chislo = scanner.nextInt();
        int chislo1 = 1;
        int chislo2 = 1;
        int chisloFibonachi = 0;
        System.out.print(chislo1 + " " + chislo2 + " ");

        while (chisloFibonachi < chislo) {
            chisloFibonachi = chislo1 + chislo2;
            if (chisloFibonachi > chislo) break;
            else {System.out.print(chisloFibonachi + " ");
                chislo1 = chislo2;
                chislo2 = chisloFibonachi;
            }
        }


    }


}
