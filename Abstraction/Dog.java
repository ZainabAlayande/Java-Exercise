package Abstraction;

public class Dog implements Animal {
    @Override
    public void move() {
        System.out.println("Dog moving");
    }

    @Override
    public void cry() {
        System.out.println("Dog crying");

    }

    @Override
    public void makeNoise() {
        System.out.println("Dog making noise");

    }
}
