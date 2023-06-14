package ua.lviv.iot.algo.part1.lab1.models;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CircularSawTest {

    @Test
    void getWorking() {
        CircularSaw circularSaw = new CircularSaw();
        circularSaw.setWorking(true);
        assertEquals(true, circularSaw.getWorking());
    }

    @Test
    void getBrand() {
        CircularSaw circularSaw = new CircularSaw();
        circularSaw.setBrand("T-1000");
        assertEquals("T-1000", circularSaw.getBrand());
    }

    @Test
    void getPower() {
        CircularSaw circularSaw = new CircularSaw();
        circularSaw.setPower(1000);
        assertEquals(1000, circularSaw.getPower());
    }

    @Test
    void getWorkTimeInHours() {
        CircularSaw circularSaw = new CircularSaw();
        circularSaw.setWorkTimeInHours(8);
        assertEquals(8, circularSaw.getWorkTimeInHours());
    }

    @Test
    void setBrand() {
        CircularSaw circularSaw = new CircularSaw();
        circularSaw.setBrand("T-1000");
        assertEquals("T-1000", circularSaw.getBrand());
    }

    @Test
    void setPower() {
        CircularSaw circularSaw = new CircularSaw();
        circularSaw.setPower(1000);
        assertEquals(1000, circularSaw.getPower());
    }

    @Test
    void setWorking() {
        CircularSaw circularSaw = new CircularSaw();
        circularSaw.setWorking(true);
        assertEquals(true, circularSaw.getWorking());
    }

    @Test
    void setWorkTimeInHours() {
        CircularSaw circularSaw = new CircularSaw();
        circularSaw.setWorkTimeInHours(8);
        assertEquals(8, circularSaw.getWorkTimeInHours());
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

    @Test
    void getRadius() {
        CircularSaw circularSaw = new CircularSaw();
        circularSaw.setRadius(0.07);
        assertEquals(0.07, circularSaw.getRadius());
    }

    @Test
    void getWidth() {
        CircularSaw circularSaw = new CircularSaw();
        circularSaw.setWidth(0.07);
        assertEquals(0.07, circularSaw.getWidth());
    }

    @Test
    void setRadius() {
        CircularSaw circularSaw = new CircularSaw();
        circularSaw.setRadius(0.07);
        assertEquals(0.07, circularSaw.getRadius());
    }

    @Test
    void setWidth() {
        CircularSaw circularSaw = new CircularSaw();
        circularSaw.setWidth(0.07);
        assertEquals(0.07, circularSaw.getWidth());
    }
}