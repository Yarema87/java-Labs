package ua.lviv.iot.algo.part1.lab1.models;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString

public class Chainsaw extends Saw{
    private double fuelTankCapacity;
    private double fuelLevel;
    public boolean start() {
        setWorking(true);
        return getWorking();
    }
    public boolean stop() {
        setWorking(false);
        return getWorking();
    }
    public double charge(double fuel){
        this.fuelLevel = fuelLevel + fuel;
        return this.fuelLevel;
    }
    public String convertingToString(){
        Chainsaw chainsaw = new Chainsaw();
        return chainsaw + "";
    }
    @Override
    public double getRemainingWorkTime() {
        return (fuelLevel / 0.6);
    }
    public Chainsaw(String brand, int power, boolean isWorking, double workingTimeInHours, double fuelTankCapacity, double fuelLevel){
        super(brand, power, isWorking, workingTimeInHours);
        this.fuelTankCapacity = fuelTankCapacity;
        this.fuelLevel = fuelLevel;
    }
}
