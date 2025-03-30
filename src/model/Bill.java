package model;

import java.time.LocalDateTime;

public class Bill {
    private String id;
    private int totalAmount;
    private Ticket ticket;
    private LocalDateTime exitTime;
//    private Operator op;
//    private int totalDuration;

    public Bill(String id, int totalAmount, Ticket ticket, LocalDateTime exitTime) {
        this.id = id;
        this.totalAmount = totalAmount;
        this.ticket = ticket;
        this.exitTime = exitTime;
//        this.op = op;
    }
}
