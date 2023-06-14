package ua.lviv.iot.algo.part1.lab1.models;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString

public class Chainsaw {
    private String brand;
    private int power;
    private double fuelTankCapacity;
    private double fuelLevel;
    private boolean isWorking;
    private static Chainsaw instance;
    public boolean start(){
        Chainsaw chainsaw = new Chainsaw();
        setWorking(true);
        return isWorking;
    }
    public boolean stop(){
        Chainsaw chainsaw = new Chainsaw();
        setWorking(false);
        return isWorking;
    }
    public boolean cutWood(int length){
        Chainsaw chainsaw = new Chainsaw();
        setWorking(true);
        while (length >= 0.0) {
            if (fuelLevel >= 0.0) {
                System.out.println("another meter of wood was cut");
            }
            else{
                System.out.println("there are no fuel in tank");
                setWorking(false);
            }
            fuelLevel -= 0.1;
            length -= 1;
        }
        if (length == 0){
            System.out.println("wood was successfully cut");
            return true;
        }
        else{
            System.out.println("we ran out of fuel before ending of cutting tree");
            return false;
        }
    }

    public static Chainsaw getInstance(){
        if (instance == null){
            return new Chainsaw();
        }
        return instance;
    }
    public static void main(String[] args){
        Chainsaw[] arrayOfChainsaws;
        arrayOfChainsaws = new Chainsaw[4];
        arrayOfChainsaws[0] = new Chainsaw();
        arrayOfChainsaws[1] = new Chainsaw("T-1000",900,2.5,2.3,false);
        arrayOfChainsaws[2] = getInstance();
        arrayOfChainsaws[2].setBrand("T-800");
        arrayOfChainsaws[2].setPower(1100);
        arrayOfChainsaws[2].setFuelTankCapacity(3.2);
        arrayOfChainsaws[2].setFuelLevel(3.0);
        arrayOfChainsaws[2].setWorking(false);
        arrayOfChainsaws[3] = getInstance();
        arrayOfChainsaws[3].setBrand("Halo 3000");
        arrayOfChainsaws[3].setPower(850);
        arrayOfChainsaws[3].setFuelTankCapacity(2.3);
        arrayOfChainsaws[3].setFuelLevel(1.6);
        arrayOfChainsaws[3].setWorking(false);
        int i = 0;
        while(i < arrayOfChainsaws.length){
            System.out.println(arrayOfChainsaws[i]);
            i+=1;
        }
    }
}