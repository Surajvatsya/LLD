package model.startegy;

public class UPIStartegy implements paymentStrategy{
    @Override
    public void pay(int amount) {
        int totalAmount = amount + 200;
        System.out.println("Total AMount pay = " + totalAmount);
    }
}
