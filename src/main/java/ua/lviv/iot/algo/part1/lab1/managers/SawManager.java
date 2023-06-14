package ua.lviv.iot.algo.part1.lab1.managers;

import ua.lviv.iot.algo.part1.lab1.models.Chainsaw;
import ua.lviv.iot.algo.part1.lab1.models.CircularSaw;
import ua.lviv.iot.algo.part1.lab1.models.ElectricSaw;
import ua.lviv.iot.algo.part1.lab1.models.Saw;

import java.util.LinkedList;
import java.util.List;

public class SawManager {
    private static List<Saw> saws = new LinkedList<>();
    public List<Saw> findAllWorking(){
        return saws.stream().filter( saw -> saw.getWorking() == true).toList();
    }
    public List<Saw> findAllMorePowerfulThan(int power){
        return saws.stream().
                filter( saw -> saw.getPower() > power).
                toList();
    }

    private void addSaw(Saw sawToAdd){
        this.saws.add(sawToAdd);
    };
    public static void main(String ... strings){
        List<Saw> saws = new LinkedList<>();
        SawManager sawManager = new SawManager();
        sawManager.addSaw(new Chainsaw());
        sawManager.addSaw(new Chainsaw("R2D2", 950, false, 5.2,3.6, 3.1));
        sawManager.addSaw(new ElectricSaw());
        sawManager.addSaw(new ElectricSaw("T-1000", 1200, true, 2.175, 87));
        sawManager.addSaw(new CircularSaw());
        sawManager.addSaw(new CircularSaw("HAL 9000", 1600, true, 8, 0.1, 0.005));
        for (Saw saw : sawManager.saws){
            System.out.println(saw);
        }
        System.out.println("Saws more powerful than setted power:");
        var saws1 = sawManager.findAllMorePowerfulThan(1000);
        for (Saw saw : saws1){
            System.out.println(saw);
        }
        System.out.println("Working saws:");
        var saws2 = sawManager.findAllWorking();
        for (Saw saw : saws1){
            System.out.println(saw);
        }
    }
}
