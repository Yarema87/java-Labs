package ua.lviv.iot.algo.part1.lab1.models;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString

public class Jigsaw extends Saw{
    private double widthOfCanvas;
    private double lengthOfCanvas;
    public boolean start(){
        setWorking(true);
        return getWorking();
    }
    public boolean stop(){
        setWorking(false);
        return getWorking();
    }
    public String convertToString() {
        Jigsaw jigsaw = new Jigsaw();
        return jigsaw + "";
    }
    @Override
    public double getRemainingWorkTime() {
        return 8;
    }
    public Jigsaw(String brand, int power, boolean isWorking, double workingTimeInHours, double widthOfCanvas, double lengthOfCanvas){
        super(brand, power, isWorking, workingTimeInHours);
        this.widthOfCanvas = widthOfCanvas;
        this.lengthOfCanvas = lengthOfCanvas;
    }
}
