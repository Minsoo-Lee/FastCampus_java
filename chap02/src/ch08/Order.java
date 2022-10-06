package ch08;

public class Order {
    String orderNum;
    String phoneNum;
    String address;
    String orderDate;
    String orderTime;
    int price;
    String menuNum;

    public Order(String orderNum, String phoneNum, String address, String orderDate, String orderTime, int price, String menuNum) {
        this.orderNum = orderNum;
        this.phoneNum = phoneNum;
        this.address = address;
        this.orderDate = orderDate;
        this.orderTime = orderTime;
        this.price = price;
        this.menuNum = menuNum;
    }

    public void showInfo() {
        System.out.println("주문 접수 번호 : " + orderNum);
        System.out.println("주문 핸드폰 번호 : " + phoneNum);
        System.out.println("주문 집 주소 : " + address);
        System.out.println("주문 날짜 : " + orderDate);
        System.out.println("주문 시간 : " + orderTime);
        System.out.println("주문 가격 : " + price);
        System.out.println("메뉴 번호 : " + menuNum);
    }
}
