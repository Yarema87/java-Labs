package ua.lviv.iot.algo.part1.lab1.managers;

import org.junit.jupiter.api.Test;
import ua.lviv.iot.algo.part1.lab1.models.*;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SawWriterTest {
    SawWriter writer = new SawWriter();
    final String EXPECTED_FILENAME = "example.csv";
    final String RESULT_FILENAME = "result.csv";
    final String EMPTY_EXCEPTED_FILENAME = "empty.csv";
    @Test
    void writeToFile() {
        Chainsaw chainsaw = new Chainsaw();
        Chainsaw chainsaw1 = new Chainsaw("T-1000", 900, false, 4.5, 3.2, 3.0);
        CircularSaw circularSaw = new CircularSaw();
        CircularSaw circularSaw1 = new CircularSaw("T-1000", 900, false, 4.5, 3.2, 3.0);
        ElectricSaw electricSaw = new ElectricSaw();
        ElectricSaw electricSaw1 = new ElectricSaw("T-1000", 900, false, 4.5, 60);
        Jigsaw jigsaw = new Jigsaw();
        Jigsaw jigsaw1 = new Jigsaw("T-1000", 900, false, 4.5, 3.2, 3.0);

        List<Saw> saws = Arrays.asList(chainsaw, chainsaw1, circularSaw1, circularSaw,
                electricSaw, electricSaw1, jigsaw1, jigsaw);
        writer.writeToFile(saws);

        Path expected = new File(EXPECTED_FILENAME).toPath();
        Path result = new File(RESULT_FILENAME).toPath();
        try {
            assertEquals(-1L, Files.mismatch(expected, result));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    @Test
    void writeEmptyList(){
        List<Saw> saws = Arrays.asList();
        writer.writeToFile(saws);
        Path expected = new File(EMPTY_EXCEPTED_FILENAME).toPath();
        Path result = new File(RESULT_FILENAME).toPath();
        try {
            assertEquals(-1L, Files.mismatch(expected, result));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}