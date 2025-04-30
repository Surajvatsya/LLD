package model;

import java.time.LocalDateTime;

public class Ride extends Base{

    private LocalDateTime endTime;
    private double totalfare;
    private double distance;
    private PaymentMode paymentMode;
    private RideStatus rideStatus;
    private String passengerId;
    private String driverId;


    public Ride(String id, LocalDateTime endTime, double totalfare, double distance, PaymentMode paymentMode, RideStatus rideStatus, String passengerId, String driverId) {
        super(id);
        this.endTime = endTime;
        this.totalfare = totalfare;
        this.distance = distance;
        this.paymentMode = paymentMode;
        this.rideStatus = rideStatus;
        this.passengerId = passengerId;
        this.driverId = driverId;
    }

    @Override
    public String toString() {
        return "Ride{" +
                "endTime=" + endTime +
                ", totalfare=" + totalfare +
                ", distance=" + distance +
                ", paymentMode=" + paymentMode +
                ", rideStatus=" + rideStatus +
                ", passengerId='" + passengerId + '\'' +
                ", driverId='" + driverId + '\'' +
                '}';
    }
}
