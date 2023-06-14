package ua.lviv.iot.algo.part1.lab1.models;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString

public class CircularSaw extends Saw{
    private double radius;
    private double width;
    public boolean start(){
        setWorking(true);
        return getWorking();
    }
    public boolean stop(){
        setWorking(false);
        return getWorking();
    }
    public String convertingToString(){
        CircularSaw circularsaw = new CircularSaw();
        return circularsaw + "";
    }
    @Override
    public double getRemainingWorkTime() {
        return 8;
    }
    public CircularSaw(String brand, int power, boolean isWorking, double workingTimeInHours, double radius, double width) {
        super(brand, power, isWorking, workingTimeInHours);
        this.radius = radius;
        this.width = width;
    }
}