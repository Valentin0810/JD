package lesson15;

import java.util.HashMap;
import java.util.Map;

public class Competition {

    public static Factory factory;
    public static Servant firstServant;
    public static Servant secondServant;

    public static void main(String[] args) {
        Map<RobotParts, Integer> partsInTheDump = new HashMap<>();
        RandomUtil.randomPartsInTheFirstNight(partsInTheDump);
        System.out.println(partsInTheDump.toString());
        Map<RobotParts, Integer> partsFirstCrazyScientist = new HashMap<>();
        Map<RobotParts, Integer> partsSecondCrazyScientist = new HashMap<>();
        factory = new Factory();
        firstServant = new Servant();
        secondServant = new Servant();
        Thread factoryProduction = new Thread(factory);
        Thread firstServantGo = new Thread(firstServant);
        Thread secondServantGo = new Thread(secondServant);
        factoryProduction.start();
        firstServantGo.start();
        secondServantGo.start();

        try {
            factoryProduction.join();
            firstServantGo.join();
            secondServantGo.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}