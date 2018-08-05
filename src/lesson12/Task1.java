package lesson12;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) throws IOException {
        Path path = Paths.get("resources", "temp", "text.txt");
        try (Scanner scanner = new Scanner(new BufferedInputStream(new FileInputStream(path.toFile())))) {
            while (scanner.hasNextLine()) {
                String str = scanner.nextLine().toLowerCase();
                System.out.println(str);
                char[] charArray = str.toCharArray();
                Map<Character, Integer> charMap = new HashMap<>();
                int count = 0;
                for (Character symbol : charArray)
                    if (charMap.containsKey(symbol)) {
                        charMap.put(symbol, count++);
                    } else {
                        charMap.put(symbol, 1);
                    }
                System.out.println(charMap);
            }
        } catch (
                FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}