package ua.lviv.iot.algo.part1.lab1.models;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class ElectricSawTest {
    ElectricSaw electricSaw = new ElectricSaw();

    @Test
    void charge() {
        ElectricSaw electricSaw = new ElectricSaw();
        electricSaw.setBatteryCharge(69);
        assertEquals(79, electricSaw.charge(10));
    }

    @Test
    void convertToString() {
        ElectricSaw electricSaw = new ElectricSaw();
        assertNotEquals(electricSaw, electricSaw.convertToString());
    }

    @Test
    void start() {
        ElectricSaw electricSaw = new ElectricSaw();
        electricSaw.start();
        assertEquals(true, electricSaw.getWorking());
    }

    @Test
    void stop() {
        ElectricSaw electricSaw = new ElectricSaw();
        electricSaw.stop();
        assertEquals(false, electricSaw.getWorking());
    }

    @Test
    void getRemainingWorkTime() {
        ElectricSaw electricSaw = new ElectricSaw();
        electricSaw.setBatteryCharge(60);
        assertEquals(1.5, electricSaw.getRemainingWorkTime());
    }
}