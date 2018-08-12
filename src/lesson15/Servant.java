package lesson15;

import lombok.AllArgsConstructor;

import java.util.Map;

@AllArgsConstructor
public class Servant implements Runnable {


    @Override
    public void run() {

        while (true) {
            try {
                System.out.println(Thread.currentThread().getName() + " пытается забрать детали");
                Map<RobotParts, Integer> servantsParts= RandomUtil.servantGetRandomParts();
                System.out.println(Thread.currentThread().getName() + " забрал " + servantsParts);
                System.out.println("Количество деталей: " + servantsParts.toString());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}