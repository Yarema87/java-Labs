package ua.lviv.iot.algo.part1.lab1.models;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class CircularSawTest {
    CircularSaw circularSaw = new CircularSaw();

    @Test
    void convertToString() {
        CircularSaw circularSaw = new CircularSaw();
        assertNotEquals(circularSaw, circularSaw.convertToString());
    }

    @Test
    void start() {
        CircularSaw circularSaw = new CircularSaw();
        circularSaw.start();
        assertEquals(true, circularSaw.getWorking());
    }

    @Test
    void stop() {
        CircularSaw circularSaw = new CircularSaw();
        circularSaw.stop();
        assertEquals(false, circularSaw.getWorking());
    }

    @Test
    void getRemainingWorkTime() {
        CircularSaw circularSaw = new CircularSaw();
        assertEquals(8, circularSaw.getRemainingWorkTime());
    }
}