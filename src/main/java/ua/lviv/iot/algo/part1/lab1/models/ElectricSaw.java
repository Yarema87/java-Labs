package ua.lviv.iot.algo.part1.lab1.models;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString

public class ElectricSaw extends Saw {
    private int batteryCharge;
    public double charge(int charge){
        this.batteryCharge = batteryCharge + charge;
        return this.batteryCharge;
    }
    public boolean start(){
        setWorking(true);
        return getWorking();
    }
    public boolean stop(){
        setWorking(false);
        return getWorking();
    }
    public String convertingToString(){
        ElectricSaw electricSaw = new ElectricSaw();
        return electricSaw + "";
    }
    @Override
    public double getRemainingWorkTime() {
        return (batteryCharge * 1.5 / 60);
    }
    public ElectricSaw(String brand, int power, boolean isWorking, double workingTimeInHours, int batteryCharge){
        super(brand, power, isWorking, workingTimeInHours);
        this.batteryCharge = batteryCharge;
    }
}
