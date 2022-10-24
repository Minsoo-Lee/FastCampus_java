package ch16;

public class Player {
    private PlayerLevel level;

    public Player() {
        level = new BeginnerLevel();
    }

    public void upgradeLevel(PlayerLevel pLevel) {
        this.level = pLevel;
    }

    public void play(int count) {
        level.showLevelMessage();
        level.run();
        level.go(count);
        level.turn();
    }
}
