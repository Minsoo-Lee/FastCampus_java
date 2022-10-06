package ch08;

public class MainTest {
    public static void main(String[] args) {
        Person Thomas = new Person(180, 78, "Thomas", "남성", 37);
        Thomas.showInfo();

        Order order = new Order("202011020003", "01023450001", "서울시 강남구 역삼동 111-333", "20201102", "130258", 35000, "0003");
        order.showInfo();
    }
}
