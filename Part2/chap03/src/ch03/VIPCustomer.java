package ch03;

public class VIPCustomer extends Customer {
    String agentId;
    double salesRatio;

    public VIPCustomer(int customerId, String customerName) {
        super(customerId, customerName);
        bonusRatio = 0.05;
        salesRatio = 0.1;
        customerGrade = "VIP";
        System.out.println("VIPCustomer(int, String) call");
    }

    public VIPCustomer() {
        super(0, "no-name");
        // 컴파일러가 알아서 넣어줌
        bonusRatio = 0.05;
        salesRatio = 0.1;
        customerGrade = "VIP";
        System.out.println("VIPCustomer() call");
    }


    public String getAgentId() {
        return agentId;
    }
}
