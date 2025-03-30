package model;

public abstract class Payment {
    private String id;
    private Bill bill;
    private PaymentStatus paymentStatus;

    public Payment(String id, Bill bill) {
        this.id = id;
        this.bill = bill;
        this.paymentStatus = PaymentStatus.PENDING;
    }

    public void setPaymentStatus(PaymentStatus paymentStatus) {
        this.paymentStatus = paymentStatus;
    }

    public PaymentStatus getPaymentStatus() {
        return paymentStatus;
    }

//    public abstract void pay(int amount);

}

//card
