package ua.lviv.iot.algo.part1.lab1.models;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SawTest {

    @Test
    void getRemainingWorkTime() {
    }

    @Test
    void getWorking() {
        Chainsaw chainsaw = new Chainsaw();
        chainsaw.setWorking(true);
        assertEquals(true, chainsaw.getWorking());
    }

    @Test
    void getBrand() {
        Chainsaw chainsaw = new Chainsaw();
        chainsaw.setBrand("T-1000");
        assertEquals("T-1000", chainsaw.getBrand());
    }

    @Test
    void getPower() {
        Chainsaw chainsaw = new Chainsaw();
        chainsaw.setPower(1000);
        assertEquals(1000, chainsaw.getPower());
    }

    @Test
    void getWorkTimeInHours() {
        Chainsaw chainsaw = new Chainsaw();
        chainsaw.setWorkTimeInHours(3.5);
        assertEquals(3.5, chainsaw.getWorkTimeInHours());
    }

    @Test
    void setBrand() {
        Chainsaw chainsaw = new Chainsaw();
        chainsaw.setBrand("T-1000");
        assertEquals("T-1000", chainsaw.getBrand());
    }

    @Test
    void setPower() {
        Chainsaw chainsaw = new Chainsaw();
        chainsaw.setPower(1000);
        assertEquals(1000, chainsaw.getPower());
    }

    @Test
    void setWorking() {
        Chainsaw chainsaw = new Chainsaw();
        chainsaw.setWorking(true);
        assertEquals(true, chainsaw.getWorking());
    }

    @Test
    void setWorkTimeInHours() {
        Chainsaw chainsaw = new Chainsaw();
        chainsaw.setWorkTimeInHours(3.5);
        assertEquals(3.5, chainsaw.getWorkTimeInHours());
    }
}