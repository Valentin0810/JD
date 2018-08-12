package lesson15;

import java.util.Map;

public class Factory implements Runnable {

    @Override
    public void run() {
        while (true) {
            try {
                Map<RobotParts,Integer> generatedPart = RandomUtil.throwOutRandomPartsInOtherNight();
                System.out.println(Thread.currentThread().getName() + " выбросила деталей " + generatedPart);
                System.out.println("Количество деталей " + generatedPart.toString());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}