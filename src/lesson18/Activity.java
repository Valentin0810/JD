package lesson18;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.SQLData;
import java.time.LocalDateTime;
import java.util.ArrayList;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Activity {

    private String startTime;
    private String name;

    @Override
    public String toString() {
        return startTime + "-" + name + '\n';
    }
}