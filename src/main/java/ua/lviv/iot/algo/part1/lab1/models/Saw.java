package ua.lviv.iot.algo.part1.lab1.models;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
public abstract class Saw {
    private String brand;
    private int power;
    private boolean isWorking = false;
    private double workTimeInHours;
    public abstract double getRemainingWorkTime();
    public boolean getWorking(){
        return isWorking;
    }
}
