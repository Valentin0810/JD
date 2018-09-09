package lesson18;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Stream;

public class Task1 {

    public static void main(String[] args) {
        try {
            String content = new String(Files.readAllBytes(Paths.get("src", "lesson18", "log.txt")), "UTF-8");
            Pattern pattern = Pattern.compile("(\\d{2}.\\d{2})\\s?([А-Яа-я]+)");
            Matcher matcher = pattern.matcher(content);
            List<Activity> schedule = new ArrayList<>();
            while (matcher.find()) {
                Activity current = new Activity((matcher.group(1)), matcher.group(2));
                schedule.add(current);
                String currentTime = current.getStartTime();
                String nextTime = schedule.listIterator().next().getStartTime();
                current.setStartTime(currentTime + "-" + nextTime);
            }
            outToFile(schedule);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void outToFile(List<Activity> schedule) {
        File file = Paths.get("src", "lesson18", "log-out.txt").toFile();
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file, true))) {
            for (Activity line : schedule) {
                writer.append(line);
                writer.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}