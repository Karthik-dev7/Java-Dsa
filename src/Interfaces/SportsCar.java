package Interfaces;

public class SportsCar implements Car{
    @Override
    public void drive() {
        System.out.println("Drives Fastly");
    }

    @Override
    public void stop() {
        System.out.println("Stops with recoil");
    }
}
