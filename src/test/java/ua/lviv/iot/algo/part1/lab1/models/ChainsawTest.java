package ua.lviv.iot.algo.part1.lab1.models;

import static org.junit.jupiter.api.Assertions.*;

import lombok.ToString;
import org.junit.jupiter.api.Test;

class ChainsawTest {

    @Test
    void charge() {
        Chainsaw chainsaw = new Chainsaw();
        chainsaw.setFuelLevel(0.2);
        assertEquals(1.4, chainsaw.charge(1.2));
    }

    @Test
    void convertToString() {
        Chainsaw chainsaw = new Chainsaw();
        assertNotEquals(chainsaw, chainsaw.convertingToString());
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

    @Test
    void getFuelTankCapacity() {
        Chainsaw chainsaw = new Chainsaw();
        chainsaw.setFuelTankCapacity(3.9);
        assertEquals(3.9, chainsaw.getFuelTankCapacity());
    }

    @Test
    void getFuelLevel() {
        Chainsaw chainsaw = new Chainsaw();
        chainsaw.setFuelLevel(3.3);
        assertEquals(3.3, chainsaw.getFuelLevel());
    }

    @Test
    void setFuelTankCapacity() {
        Chainsaw chainsaw = new Chainsaw();
        chainsaw.setFuelTankCapacity(3.9);
        assertEquals(3.9, chainsaw.getFuelTankCapacity());
    }

    @Test
    void setFuelLevel() {
        Chainsaw chainsaw = new Chainsaw();
        chainsaw.setFuelLevel(3.3);
        assertEquals(3.3, chainsaw.getFuelLevel());
    }
}