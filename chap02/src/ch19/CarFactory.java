package ch19;

public class CarFactory {
    private static CarFactory company = new CarFactory();
    private static int serialNum = 10000;



    public static CarFactory getInstance() {
        if (company == null) {
            company = new CarFactory();
        }
        return company;
    }

    public static Car createCar() {
        return new Car(++serialNum);
    }
}
