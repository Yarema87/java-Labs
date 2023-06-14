package ua.lviv.iot.algo.part1.lab1.managers;
import ua.lviv.iot.algo.part1.lab1.models.Saw;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SawWriter {
    public void writeToFile(List<Saw> saws) {
        try (FileWriter writer = new FileWriter(new File("result.csv"))) {
            List<Saw> sortedSaws = saws.stream()
                    .sorted(Comparator.comparing(o -> o.getClass()
                            .getSimpleName()))
                    .collect(Collectors.toList());

            String tempNameClass = null;
            for (Saw saw : saws) {
                if (tempNameClass != saw.getClass().getSimpleName()) {
                    writer.write(saw.getHeaders());
                    writer.write(saw.toCSV());
                    tempNameClass = saw.getClass().getSimpleName();
                } else {
                    writer.write(saw.toCSV());
                }
            }
        } catch (
                IOException e) {
            throw new RuntimeException(e);
        }
    }
}
