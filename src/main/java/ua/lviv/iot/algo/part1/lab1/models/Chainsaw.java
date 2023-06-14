package ua.lviv.iot.algo.part1.lab1.models;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString

public class Chainsaw {
    private String brand;
    private int power;
    private double fuelTankCapacity;
    private double fuelLevel;
    private boolean isWorking;
    private static Chainsaw instance;

    public boolean start() {
        setWorking(true);
        return isWorking;
    }
    public boolean stop() {
        setWorking(false);
        return isWorking;
    }
    public boolean cutWood(int length) {
        if (fuelLevel >= length * 0.1) {
            return true;
        } else {
            return false;
        }
    }
    public static Chainsaw getInstance() {
        return new Chainsaw();
    }
    public static void main(String[] args) {
        Chainsaw[] chainsaws = {new Chainsaw(), new Chainsaw("T-1000", 900, 2.5, 2.3, false), getInstance(), getInstance()};
        for (Chainsaw element : chainsaws) {
            System.out.println(element);
        }
    }
}
