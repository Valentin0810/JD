package lesson3;
//Написать программу, отображающую статистику по осадкам за N дней. N вводится пользователем.
//        Пользователь также должен ввести N целых чисел, обозначающих величину осадков в день.
//        Программа должна выводить:
//        a. Количество дней
//        b. Сумму осадков за этот период
//        c. Среднее количество осадков за этот период
//        d. Максимальное количество дневных осадков за этот период
//        Не использовать массивы!

import java.util.Random;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {

        int sumRain = 0;
        Random random = new Random();
        int maxRain = Integer.MIN_VALUE;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество дней");
        int days = scanner.nextInt();

        for (int i = 1; i <= days; i++) {
            int randomRain = random.nextInt(300);
            System.out.println(randomRain);

            sumRain = sumRain + randomRain;

            if (maxRain < randomRain) {
                maxRain = randomRain;
            }
        }
        int averageRain = sumRain / days;
        System.out.println("Количество дней: " + days + "\n" + "Сумма осадков за период: " + sumRain + "\n" +
                "Среднее количество осадков за период: " + averageRain + "\n" +
                "Максимальное количество осадков: " + maxRain);
    }
}

