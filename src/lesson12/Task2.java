package lesson12;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Paths;

public class Task2 {
    public static void main(String[] args) throws IOException {
        File resourcesDirectory = new File("resources");
        File file = new File("randomInteger.txt");
    }

    private static void outToFile(int[] array) {
        File file = Paths.get("resources", "randomInteger.txt").toFile();
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file, true))) {
            for (int i = 0; i < 1000; i++) {
                array[i] = ((int) (Math.random() * 31));
                bufferedWriter.write(array[i]);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}