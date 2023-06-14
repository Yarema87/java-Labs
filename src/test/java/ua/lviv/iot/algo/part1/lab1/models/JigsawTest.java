package ua.lviv.iot.algo.part1.lab1.models;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class JigsawTest {
    Jigsaw jigsaw = new Jigsaw();

    @Test
    void convertToString() {
        Jigsaw jigsaw = new Jigsaw();
        assertNotEquals(jigsaw, jigsaw.convertToString());
    }

    @Test
    void start() {
        Jigsaw jigsaw = new Jigsaw();
        jigsaw.start();
        assertEquals(true, jigsaw.getWorking());
    }

    @Test
    void stop() {
        Jigsaw jigsaw = new Jigsaw();
        jigsaw.stop();
        assertEquals(false, jigsaw.getWorking());
    }

    @Test
    void getRemainingWorkTime() {
        Jigsaw jigsaw = new Jigsaw();
        assertEquals(8, jigsaw.getRemainingWorkTime());
    }
}