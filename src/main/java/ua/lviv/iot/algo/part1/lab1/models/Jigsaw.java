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

public class Jigsaw extends Saw {
    public static final String HEADERS = "widthOfCanvas, lengthOfCanvas, " +
            "brand, power, isWorking, workTimeInHours\n";
    private double widthOfCanvas;
    private double lengthOfCanvas;

    public boolean start() {
        setWorking(true);
        return getWorking();
    }

    public boolean stop() {
        setWorking(false);
        return getWorking();
    }

    public String convertToString() {
        Jigsaw jigsaw = new Jigsaw();
        return jigsaw + "";
    }

    @Override
    public double getRemainingWorkTime() {
        int timeWithElectricityOn = 8;
        return timeWithElectricityOn;
    }

    public Jigsaw(final String brand, final int power, final boolean isWorking,
                  final double workingTimeInHours, final double widthOfCanvas,
                  final double lengthOfCanvas) {
        super(brand, power, isWorking, workingTimeInHours);
        this.widthOfCanvas = widthOfCanvas;
        this.lengthOfCanvas = lengthOfCanvas;
    }

    public String getHeaders() {
        return HEADERS;
    }

    public String toCSV() {
        return String.format("%s, %s, %s, %s, %s, %s\n", getLengthOfCanvas(),
                getWidthOfCanvas(), getBrand(),
                getPower(), getWorking(), getWorkTimeInHours());
    }
}
