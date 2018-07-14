package lesson2;
//Написать программу, вычисляющую корни квадратного уравнения
//        видаax ² + bx + c = 0, где a, b и c - вводимые пользователем из консоли
//        данные.
//        Учитывать только реальные корни (в случае отрицательного
//        дискриминанта выводить сообщение пользователю).
//        При решении создать и использовать следующие вынесенные
//        функции:
//        - функция isPositive, определяющая, является ли число
//        положительным
//        - функция isZero, определяющая, является ли число нулём
//        - функция discriminant, вычисляющая дискриминант
import java.util.Scanner;

public class Task3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        double d;
        double x1;
        double x2;
        d = discriminant(a, b, c);
        if (d < 0) {
            System.out.println("Отрицательный дискриминант");

        }
        if (isPositive(a, b, c)) {
            x1 = (-b + Math.sqrt(d)) / (2 * a);
            x2 = (-b - Math.sqrt(d)) / (2 * a);
            System.out.println( "Корни уравнения: "+x1 + " " + x2);
        }
        if(isZero(a,b,c)) {
            x1 = (-b + Math.sqrt(d)) / (2 * a);

            System.out.println("Корень уравнения: "+x1);
        }
    }

    public static double discriminant(int a, int b, int c) {
        double d;
        d = (double) (b * b - 4 * a * c);
        return d;
    }

    public static boolean isPositive(int a, int b, int c) {
        if (discriminant(a, b, c) > 0)
        {
            return true;}
        return false;
    }

    public static boolean isZero(int a, int b, int c) {
        if (discriminant(a, b, c) == 0)         {
            return true;}
        return false;

    }}
