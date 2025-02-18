package Interfaces;

public class Main implements A, B{

    @Override
    public void greet() {

    }

    public static void main(String[] args) {
//        Car car = new Car();
//        car.acc();
//        car.start();
//        car.stop();
//        car.brake();
        Sedan car = new Sedan();
        car.drive();
        car.stop();

        SportsCar cars = new SportsCar();
        cars.drive();
        cars.stop();
    }
}
