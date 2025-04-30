package model;

import java.util.Objects;

public class PaymentFactory {
    public static Payment createPaymentMethod(String type,String id,String orderId, String cardOwnername, String upiId){
        if(Objects.equals(type, "creditCard"))
            return new CreditCard(id,PaymentStatus.PENDING,orderId,cardOwnername);
        else if(Objects.equals(type, "UPI"))
            return new UPI(id,PaymentStatus.PENDING,orderId,upiId);
        else return  null;
    }
}
