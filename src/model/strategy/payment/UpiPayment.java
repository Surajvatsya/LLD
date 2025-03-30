package model.strategy.payment;

public class UpiPayment implements PaymentStrategy{
    private String  upiId;

    public UpiPayment(String upiId) {
        this.upiId = upiId;
    }

    @Override
    public void pay(int amount) {
        System.out.println("Paid by UPI");
    }
}
