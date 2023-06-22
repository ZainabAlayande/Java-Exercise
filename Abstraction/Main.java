package Abstraction;

public class Main {

    public static void main(String[] args) {
//        Car car = new Honda();
//        System.out.println(car.stopMoving());

        Animal animal = new Dog();
        animal.cry();
        animal.move();
        animal.makeNoise();

        System.out.println();

        Dog dog = new Dog();
        dog.cry();
        dog.move();
        dog.makeNoise();
    }
}
