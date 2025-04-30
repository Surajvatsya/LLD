package model;

import java.time.LocalDateTime;
import java.util.List;

public class Booking {
    private String id;
    private int totalAmount;
    private LocalDateTime localDateTime;
    private PaymentStatus paymentStatus;
//    private List<SeatAndType> seatAndTypeList;

    public Booking(String id, int totalAmount, LocalDateTime localDateTime, PaymentStatus paymentStatus) {
        this.id = id;
        this.totalAmount = totalAmount;
        this.localDateTime = localDateTime;
        this.paymentStatus = paymentStatus;
//        this.seatAndTypeList = seatAndTypeList;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(int totalAmount) {
        this.totalAmount = totalAmount;
    }

    public LocalDateTime getLocalDateTime() {
        return localDateTime;
    }

    public void setLocalDateTime(LocalDateTime localDateTime) {
        this.localDateTime = localDateTime;
    }

    public PaymentStatus getPaymentStatus() {
        return paymentStatus;
    }

    public void setPaymentStatus(PaymentStatus paymentStatus) {
        this.paymentStatus = paymentStatus;
    }

//    public List<SeatAndType> getSeatAndTypeList() {
//        return seatAndTypeList;
//    }
//
//    public void setSeatAndTypeList(List<SeatAndType> seatAndTypeList) {
//        this.seatAndTypeList = seatAndTypeList;
//    }
}
