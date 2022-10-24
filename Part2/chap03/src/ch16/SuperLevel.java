package ch16;

public class SuperLevel extends PlayerLevel {
    @Override
    public void run() {
        System.out.println("run very fast");
    }

    @Override
    public void jump() {
        System.out.println("jump very high");
    }

    @Override
    public void turn() {
        System.out.println("turn");
    }

    @Override
    public void showLevelMessage() {
        System.out.println("====Super Level====");
    }
}
