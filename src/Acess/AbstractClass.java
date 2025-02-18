package Acess;

abstract class Animal{
    abstract void Sound();

    void normal(){
        System.out.println("random greet");
    }
}

class Cat extends Animal{
    @Override
    void Sound() {
        System.out.println("Meow Meow");
    }
}

class Dog extends Animal{
    @Override
    void Sound() {
        System.out.println("Bark Bark");
    }
}

public class AbstractClass {
    public static void main(String[] args) {

        Dog dog = new Dog();
        dog.Sound();

        Cat cat = new Cat();
        cat.Sound();

        cat.normal();
    }
}