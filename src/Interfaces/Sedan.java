package Interfaces;

public class Sedan implements Car{
    @Override
    public void drive() {
        System.out.println("Drives Smoothly");
    }

    @Override
    public void stop() {
        System.out.println("Stops Gently");
    }
}
