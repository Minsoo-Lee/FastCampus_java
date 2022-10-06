package ch14;

public class Subway {
    int lineNum;
    int passengerCount;
    int money;

    public Subway(int lineNum) {
        this.lineNum = lineNum;
    }
    public void take(int money) {
        this.money += money;
        passengerCount++;
    }
    public void showSubwayInfo() {
        System.out.println(lineNum + "번의 승객 수는 " + passengerCount + "명 이고, 수입은 " + money);
    }
}
