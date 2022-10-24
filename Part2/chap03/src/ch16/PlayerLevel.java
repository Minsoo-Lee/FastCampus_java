package ch16;

public abstract class PlayerLevel {
    public abstract void run();
    public abstract void jump();
    public abstract void turn();
    public abstract void showLevelMessage();

    public void go(int count) {
        for (int i = 0; i < count; i++)
            jump();
    }
}
