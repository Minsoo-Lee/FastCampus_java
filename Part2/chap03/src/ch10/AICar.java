package ch10;

public class AICar extends Car {
    @Override
    public void drive() {
        System.out.println("Auto Drive");
    }

    @Override
    public void stop() {
        System.out.println("Auto Stop");
    }
}
