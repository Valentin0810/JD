package lesson2;
//Имеются два дома размерами a на b и c на d. Размеры вводятся
//        польователем с консоли.
//        Проверить, помещаются ли эти дома на участке размерами e на f.
//        Стороны домов - параллельны сторонам участка, в остальном
//        размещение может быть любым.
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите размеры первого дома");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println("Введите размеры второго дома");
        int c = scanner.nextInt();
        int d = scanner.nextInt();
        System.out.println("Введите размеры участка");
        int e = scanner.nextInt();
        int f = scanner.nextInt();
        System.out.println(sizeHouse(a,b,c,d,e,f));


    }

    public static String sizeHouse(int a, int b, int c, int d, int e, int f) {
        String house1;
        String house2;
        if ((a<=e && b<=f) || (a<=f&&b<=e)){
            house1 ="Дом №1 помещается на участке";}
        else { house1="Дом №1 не помещается на участке";}
        if ((c<=e && d<=f) || (c<=f&&d<=e)){
            house2="Дом №2 помещается на участке";}
        else {house2="Дом №2 не помещается на участке";}

        return house1 +"\n" + house2;
    }
}
