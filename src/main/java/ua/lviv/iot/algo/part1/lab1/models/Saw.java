package ua.lviv.iot.algo.part1.lab1.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
public abstract class Saw {
    public static final String HEADERS = "brand, power, "
            + "isWorking, workTimeInHours\n";
    private String brand;
    private int power;
    private boolean isWorking = false;
    private double workTimeInHours;

    public abstract double getRemainingWorkTime();

    public boolean getWorking() {
        return isWorking;
    }

    public abstract String getHeaders();

    public abstract String toCSV();
}
