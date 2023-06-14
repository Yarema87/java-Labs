package ua.lviv.iot.algo.part1.lab1.managers;

import ua.lviv.iot.algo.part1.lab1.models.Saw;

import java.util.ArrayList;
import java.util.List;


public class SawManager {
    private List<Saw> saws = new ArrayList<>();

    public List<Saw> findAllWorking() {
        return saws.stream().filter(saw -> saw.getWorking()).toList();
    }

    public List<Saw> findAllMorePowerfulThan(final int power) {
        List<Saw> morePowerfulSaws = saws.stream().
                filter(saw -> saw.getPower() > power).
                toList();
        return morePowerfulSaws;
    }

    public void addSaw(Saw sawToAdd) {
        this.saws.add(sawToAdd);
    }

    public List<Saw> getSaws() {
        return saws;
    }
}
