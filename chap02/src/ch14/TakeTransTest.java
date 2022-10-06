package ch14;

public class TakeTransTest {
    public static void main(String[] args) {
        Student studentJ = new Student("James", 5000);
        Student studentT = new Student("Thomas", 5000);

        Bus bus100 = new Bus(100);
        Bus bus500 = new Bus(500);

        studentJ.takeBus(bus100);
        Subway green = new Subway(2);
        studentT.takeSubway(green);

        studentJ.showInfo();
        studentT.showInfo();
        bus100.showBusInfo();
        green.showSubwayInfo();

        Student Edward = new Student("Edward", 20000);
        Taxi taxi = new Taxi("잘나간다 운수");
        Edward.takeTaxi(taxi);

        Edward.showInfo();
        taxi.showTaxiInfo();
    }
}
