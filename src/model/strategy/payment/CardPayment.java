package model.strategy.payment;

public class CardPayment implements PaymentStrategy{
    private final String cardNumber;
    private final String CardHolderName;
//    private int amount

    public CardPayment(String cardNumber, String cardHolderName) {
        this.cardNumber = cardNumber;
        CardHolderName = cardHolderName;
    }

    @Override
    public void pay(int amount) {
        if(cardNumber==null){
            System.out.println("Please Enter Credentials");
        }
        else{
            System.out.println("Payment SuccessFul");
        }
    }
}
