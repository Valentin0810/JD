package lesson10;

import java.util.HashMap;
import java.util.Map;

public class Garage {

    public static void main(String[] args) {
        Car[] allCars = {new Sedan("BMW", "325", 2005, 5, "white"),
                new Coupe("Audi", "TT", 2008, 4, "gray"),
                new Minivan("Mazda", "MPV", 2003, 5, "blue"),
                new Crossover("Mercedes", "ML", 2004, 5, "red"),
                new Crossover("Geely", "Atlas", 2018, 5, "black"),
                new Sedan("Lada", "Vesta", 2017, 5, "orange"),
                new Sedan("Lada", "Vesta", 2017, 5, "orange"),
                new Sedan("Volkswagen", "Jetta", 2013, 5, "green"),
        };
        Map<Car, Integer> parking = new HashMap<>();
        for (Car car : allCars) {
            int countCars = 0;
            if (parking.containsKey(car)) {
                parking.put(car, countCars++);
            } else {
                parking.put(car, 1);
            }
        }
        System.out.println(parking);
    }
}