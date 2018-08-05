package lesson10;

import sun.awt.SunHints;

import java.util.HashMap;
import java.util.Map;

public class Test {

    public static void main(String[] args) {
        Map<Car, Integer> parking = new HashMap<>();
        parking.put(new Sedan("BMW", "325", 2005, 5, "white"), 4);
        parking.put(new Coupe("Audi", "TT", 2008, 4, "gray"), 2);
        parking.put(new Minivan("Mazda", "MPV", 2003, 5, "blue"), 1);
        parking.put(new Crossover("Mercedes", "ML", 2004, 5, "red"), 1);
        parking.put(new Crossover("Geely", "Atlas", 2018, 5, "black"), 3);
        parking.put(new Sedan("Lada", "Vesta", 2017, 5, "orange"), 5);
        parking.put(new Sedan("Volkswagen", "Jetta", 2013, 5, "green"), 3);
        System.out.println(parking);

        Car newCar = new Coupe("Mazda", "626", 1993, 4, "red");
        for (Map.Entry<Car, Integer> car : parking.entrySet()) {
            if (parking.containsKey(newCar)) {
                parking.put(newCar, parking.get(newCar) + 1);
            } else {
                parking.put(newCar, 1);
            }
            System.out.println(parking);
        }
    }
}