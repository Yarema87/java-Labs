package ua.lviv.iot.algo.part1.lab1.managers;

import org.junit.jupiter.api.Test;
import ua.lviv.iot.algo.part1.lab1.models.Chainsaw;
import ua.lviv.iot.algo.part1.lab1.models.Jigsaw;
import ua.lviv.iot.algo.part1.lab1.models.Saw;

import java.util.LinkedList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SawManagerTest {
    @Test
    void testFindAllWorking() {
        SawManager manager = new SawManager();
        Chainsaw chainsaw = new Chainsaw();
        chainsaw.setWorking(true);
        Jigsaw jigsaw = new Jigsaw();
        jigsaw.setWorking(false);
        manager.addSaw(chainsaw);
        manager.addSaw(jigsaw);
        List<Saw> saws = new LinkedList<>();
        saws.add(chainsaw);
        assertEquals(saws, manager.findAllWorking());
    }
    @Test
    void testFindAllMorePowerfulThan() {
        SawManager manager = new SawManager();
        Chainsaw chainsaw = new Chainsaw("R2D2", 850,
                true, 3.5, 3.3, 3.0);
        Jigsaw jigsaw = new Jigsaw("T-1000", 500,
                false, 8.0, 0.02, 0.3);
        manager.addSaw(chainsaw);
        manager.addSaw(jigsaw);
        List<Saw> saws = new LinkedList<>();
        saws.add(chainsaw);
        assertEquals(saws, manager.findAllMorePowerfulThan(600));
    }
}