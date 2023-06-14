package ua.lviv.iot.algo.part1.lab1.models;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ElectricSawTest {
    @Test
    void charge() {
        ElectricSaw electricSaw = new ElectricSaw();
        electricSaw.setBatteryCharge(69);
        assertEquals(79, electricSaw.charge(10));
    }


    @Test
    void getWorking() {
        ElectricSaw electricSaw = new ElectricSaw();
        electricSaw.setWorking(true);
        assertEquals(true, electricSaw.getWorking());
    }

    @Test
    void getBrand() {
        ElectricSaw electricSaw = new ElectricSaw();
        electricSaw.setBrand("T-1000");
        assertEquals("T-1000", electricSaw.getBrand());
    }

    @Test
    void getPower() {
        ElectricSaw electricSaw = new ElectricSaw();
        electricSaw.setPower(1000);
        assertEquals(1000, electricSaw.getPower());
    }

    @Test
    void getWorkTimeInHours() {
        ElectricSaw electricSaw = new ElectricSaw();
        electricSaw.setWorkTimeInHours(2);
        assertEquals(2, electricSaw.getWorkTimeInHours());
    }

    @Test
    void setBrand() {
        ElectricSaw electricSaw = new ElectricSaw();
        electricSaw.setBrand("T-1000");
        assertEquals("T-1000", electricSaw.getBrand());
    }

    @Test
    void setPower() {
        ElectricSaw electricSaw = new ElectricSaw();
        electricSaw.setPower(1000);
        assertEquals(1000, electricSaw.getPower());
    }

    @Test
    void setWorking() {
        ElectricSaw electricSaw = new ElectricSaw();
        electricSaw.setWorking(true);
        assertEquals(true, electricSaw.getWorking());
    }

    @Test
    void setWorkTimeInHours() {
        ElectricSaw electricSaw = new ElectricSaw();
        electricSaw.setWorkTimeInHours(2);
        assertEquals(2, electricSaw.getWorkTimeInHours());
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

    @Test
    void getBatteryCharge() {
        ElectricSaw electricSaw = new ElectricSaw();
        electricSaw.setBatteryCharge(60);
        assertEquals(60, electricSaw.getBatteryCharge());
    }

    @Test
    void setBatteryCharge() {
        ElectricSaw electricSaw = new ElectricSaw();
        electricSaw.setBatteryCharge(60);
        assertEquals(60, electricSaw.getBatteryCharge());
    }
}
