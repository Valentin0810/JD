package lesson15;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

import java.util.Map;
import java.util.Random;

@NoArgsConstructor(access = AccessLevel.PRIVATE)

public final class RandomUtil {

    private static final Random RANDOM = new Random();
    private static final int DEFAULT_QUANTITY = 20;

    public static int generateQuantityParts(int max) {
        return RANDOM.nextInt(max);
    }

    public static RobotParts randomParts() {
        int robotPart = new Random().nextInt(RobotParts.values().length);
        return RobotParts.values()[robotPart];
    }

    public static void randomPartsInTheFirstNight(Map<RobotParts, Integer> partsInTheDump) {
        for (int quantityPartsInTheDamp = 0; quantityPartsInTheDamp < DEFAULT_QUANTITY; quantityPartsInTheDamp++) {
            RobotParts currentPart = randomParts();
            if (partsInTheDump.containsKey(currentPart)) {
                int quantity = partsInTheDump.get(currentPart);
                partsInTheDump.put(currentPart, quantity + 1);
            } else {
                partsInTheDump.put(currentPart, 1);
            }
        }
    }

    public static void throwOutRandomPartsInOtherNight(Map<RobotParts, Integer> partsInTheDump) {
        for (int quantityPartsInTheDamp = 0; quantityPartsInTheDamp < RandomUtil.generateQuantityParts((4) + 1); quantityPartsInTheDamp++) {
            RobotParts currentPart = randomParts();
            if (partsInTheDump.containsKey(currentPart)) {
                int quantity = partsInTheDump.get(currentPart);
                partsInTheDump.put(currentPart, quantity + 1);
            } else {
                partsInTheDump.put(currentPart, 1);
            }
        }
    }

    public static void servantGetRandomParts(Map<RobotParts, Integer> partsInTheDump, Map<RobotParts, Integer> map) {
        for (int quantityPartsInTheDamp = 0; quantityPartsInTheDamp < RandomUtil.generateQuantityParts((4) + 1); quantityPartsInTheDamp++) {
            RobotParts currentPart = randomParts();
            if (partsInTheDump.containsKey(currentPart)) {
                int quantity = partsInTheDump.get(currentPart);
                partsInTheDump.put(currentPart, quantity - 1);
                if (map.containsKey(currentPart)) {
                    int quantityNewMap = map.get(currentPart);
                    map.put(currentPart, quantityNewMap + 1);
                } else {
                    map.put(currentPart, 1);
                }
            } else {
                map.put(currentPart, 0);
            }
        }
    }
}