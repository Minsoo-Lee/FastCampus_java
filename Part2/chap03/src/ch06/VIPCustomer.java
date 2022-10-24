package ch06;

public class VIPCustomer extends Customer {
    String agentId;
    double salesRatio;

    public VIPCustomer(int customerId, String customerName) {
        super(customerId, customerName);
        bonusRatio = 0.05;
        salesRatio = 0.1;
        customerGrade = "VIP";
    }

    public VIPCustomer() {
        super(0, "no-name");
        // 컴파일러가 알아서 넣어줌
        bonusRatio = 0.05;
        salesRatio = 0.1;
        customerGrade = "VIP";
    }

    public String getAgentId() {
        return agentId;
    }

    @Override
    public int calcPrice(int price) {
        bonusPoint += price * bonusRatio;
        price -= (int)(price * salesRatio);
        return price;
    }
}
