package model;

import model.factoty.Vehicle;

import java.time.LocalDateTime;

public class Ticket {
    private String id ;
    private final ParkingSpot parkingSpot;
    private LocalDateTime strartTime;
    private Vehicle vehicle;
    private Gate gate;
    private Operator operator;

    public Ticket(ParkingSpot parkingSpot, LocalDateTime strartTime, Vehicle vehicle, Gate gate, Operator operator) {
        this.parkingSpot = parkingSpot;
        this.strartTime = strartTime;
        this.vehicle = vehicle;
        this.gate = gate;
        this.operator = operator;
    }

    public ParkingSpot getParkingSpot() {
        return parkingSpot;
    }

    public LocalDateTime getStrartTime() {
        return strartTime;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public Gate getGate() {
        return gate;
    }

    public Operator getOperator() {
        return operator;
    }
}
