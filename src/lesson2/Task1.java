package lesson2;
//Имеются три числа - день, месяц и год, вводимые пользователем с
//        консоли.
//        Вывести дату следующего дня в формате &quot;День.Месяц.Год&quot;.
//        Учесть переход на следующий месяц, а также следующий год.
//        Форматирование строки &quot;День.Месяц.Год&quot; вынести в отдельную
//        функцию.
import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите день:");
        int day = scanner.nextInt();

        System.out.println("Введите месяц:");
        int month = scanner.nextInt();

        System.out.println("Введите год:");
        int year = scanner.nextInt();

        if (isDateValid(day, month, year)) {
            System.out.println(newData(day, month, year));
        } else {
            System.out.println("Дата введена некорректно!");
        }
    }

    public static boolean isTemporal(int year) {
        return (year % 4 == 0 && year % 100 != 0) || year % 400 == 0;
    }

    public static boolean isDateValid(int day, int month, int year) {
        if (day <= 0 || day > 31) {
            return false;
        }
        if (month <= 0 || month > 12) {
            return false;
        }
        switch (month) {
            case 4:
            case 6:
            case 9:
            case 11:
                if (day == 31) {
                    return false;
                }
                break;
            case 2:

                if (isTemporal(year)) {
                    if (day > 29) {
                        return false;
                    }
                } else {
                    if (day > 28) {
                        return false;
                    }
                }
                break;
        }

        return true;
    }


    public static String newData(int day, int month, int year) {

        switch (month) {
            case 4:
            case 6:
            case 9:
            case 11:
                if (day == 30) {
                    day = 1;
                    month++;
                } else {
                    day++;
                }
                break;
            case 2:
                if (isTemporal(year)) {
                    if (day == 29) {
                        day = 1;
                        month++;

                    } else {
                        day++;
                    }
                } else {
                    if (day == 28) {
                        day = 1;
                        month++;

                    } else {
                        day++;
                    }
                }
                break;
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
                if (day == 31) {
                    day = 1;
                    month++;
                } else {
                    day++;
                }
                break;
            case 12:
                if (day == 31) {
                    day = 1;
                    month = 1;
                    year++;
                } else {
                    day++;
                }
                break;
        }


        return day + "." + month + "." + year;
    }

}