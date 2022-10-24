package ch16;

public class AdvancedLevel extends PlayerLevel {
    @Override
    public void run() {
        System.out.println("run fast");
    }

    @Override
    public void jump() {
        System.out.println("jump high");
    }

    @Override
    public void turn() {
        System.out.println("can't turn");
    }

    @Override
    public void showLevelMessage() {
        System.out.println("====Advanced Level====");
    }
}
