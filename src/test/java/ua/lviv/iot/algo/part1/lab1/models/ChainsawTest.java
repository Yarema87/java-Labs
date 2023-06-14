package ua.lviv.iot.algo.part1.lab1.models;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class ChainsawTest {
    private Chainsaw chainsaw = new Chainsaw();

    @Test
    void charge() {
        Chainsaw chainsaw = new Chainsaw();
        chainsaw.setFuelLevel(0.2);
        assertEquals(1.4, chainsaw.charge(1.2));
    }

    @Test
    void convertToString() {
        Chainsaw chainsaw = new Chainsaw();
        assertNotEquals(chainsaw, chainsaw.convertToString());
    }

    @Test
    void start() {
        Chainsaw chainsaw = new Chainsaw();
        chainsaw.start();
        assertEquals(true, chainsaw.getWorking());
    }

    @Test
    void stop() {
        Chainsaw chainsaw = new Chainsaw();
        chainsaw.stop();
        assertEquals(false, chainsaw.getWorking());
    }

    @Test
    void getRemainingWorkTime() {
        Chainsaw chainsaw = new Chainsaw();
        chainsaw.setFuelLevel(3.0);
        assertEquals(5.0, chainsaw.getRemainingWorkTime());
    }
}