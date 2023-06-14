package ua.lviv.iot.algo.part1.lab1.models;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class JigsawTest {

    @Test
    void convertToString() {
        Jigsaw jigsaw = new Jigsaw();
        assertNotEquals(jigsaw, jigsaw.convertToString());
    }

    @Test
    void getWorking() {
        Jigsaw jigsaw = new Jigsaw();
        jigsaw.setWorking(true);
        assertEquals(true, jigsaw.getWorking());
    }

    @Test
    void getBrand() {
        Jigsaw jigsaw = new Jigsaw();
        jigsaw.setBrand("T-800");
        assertEquals("T-800", jigsaw.getBrand());
    }

    @Test
    void getPower() {
        Jigsaw jigsaw = new Jigsaw();
        jigsaw.setPower(870);
        assertEquals(870, jigsaw.getPower());
    }

    @Test
    void getWorkTimeInHours() {
        Jigsaw jigsaw = new Jigsaw();
        jigsaw.setWorkTimeInHours(3.5);
        assertEquals(3.5, jigsaw.getWorkTimeInHours());
    }

    @Test
    void setBrand() {
        Jigsaw jigsaw = new Jigsaw();
        jigsaw.setBrand("T-800");
        assertEquals("T-800", jigsaw.getBrand());
    }

    @Test
    void setPower() {
        Jigsaw jigsaw = new Jigsaw();
        jigsaw.setPower(870);
        assertEquals(870, jigsaw.getPower());
    }

    @Test
    void setWorking() {
        Jigsaw jigsaw = new Jigsaw();
        jigsaw.setWorking(true);
        assertEquals(true, jigsaw.getWorking());
    }

    @Test
    void setWorkTimeInHours() {
        Jigsaw jigsaw = new Jigsaw();
        jigsaw.setWorkTimeInHours(3.5);
        assertEquals(3.5, jigsaw.getWorkTimeInHours());
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

    @Test
    void getWidthOfCanvas() {
        Jigsaw jigsaw = new Jigsaw();
        jigsaw.setWidthOfCanvas(0.9);
        assertEquals(0.9, jigsaw.getWidthOfCanvas());
    }

    @Test
    void getLengthOfCanvas() {
        Jigsaw jigsaw = new Jigsaw();
        jigsaw.setLengthOfCanvas(0.9);
        assertEquals(0.9, jigsaw.getLengthOfCanvas());
    }

    @Test
    void setWidthOfCanvas() {
        Jigsaw jigsaw = new Jigsaw();
        jigsaw.setWidthOfCanvas(0.9);
        assertEquals(0.9, jigsaw.getWidthOfCanvas());
    }

    @Test
    void setLengthOfCanvas() {
        Jigsaw jigsaw = new Jigsaw();
        jigsaw.setLengthOfCanvas(0.9);
        assertEquals(0.9, jigsaw.getLengthOfCanvas());
    }
}