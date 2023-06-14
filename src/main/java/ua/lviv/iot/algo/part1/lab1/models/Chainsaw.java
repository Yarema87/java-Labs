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

public class Chainsaw extends Saw {
    public static final String HEADERS = "fuelTankCapacity, fuelLevel, brand, " +
            "power, isWorking, workTimeInHours\n";
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

    public double charge(final double fuel) {
        this.fuelLevel = fuelLevel + fuel;
        return this.fuelLevel;
    }

    public String convertToString() {
        Chainsaw chainsaw = new Chainsaw();
        return chainsaw + "";
    }

    @Override
    public double getRemainingWorkTime() {
        double consumptionFuelPerHour = 0.6;
        return fuelLevel / consumptionFuelPerHour;
    }

    @Override
    public String getHeaders() {
        return HEADERS;
    }

    @Override
    public String toCSV() {
        return String.format("%s, %s, %s, %s, %s, %s\n", getFuelTankCapacity(),
                getFuelLevel(), getBrand(),
                getPower(), getWorking(), getWorkTimeInHours());
    }

    public Chainsaw(final String brand, final int power,
                    final boolean isWorking, final double workingTimeInHours,
                    final double fuelTankCapacity, final double fuelLevel) {
        super(brand, power, isWorking, workingTimeInHours);
        this.fuelTankCapacity = fuelTankCapacity;
        this.fuelLevel = fuelLevel;
    }
}
