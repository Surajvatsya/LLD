package model;

import model.factoty.VehicleFactory;
import model.factoty.VehicleType;

public class ParkingSpot {
    private String id;
    private VehicleType vehicleType;
    private Boolean isAvailable;
    private int floorNumber;

    public ParkingSpot(String id, VehicleType vehicleType, int floorNumber) {
        this.id = id;
        this.vehicleType = vehicleType;
        this.floorNumber = floorNumber;
        this.isAvailable = true;
    }

    public VehicleType getVehicleType() {
        return vehicleType;
    }

    public Boolean getAvailable() {
        return isAvailable;
    }

    public int getFloorNumber() {
        return floorNumber;
    }

    public void setIsAvailable(){
        isAvailable = false;
    }
    public void displayParkingSpot() {
        System.out.println("Parking Spot [ID: " + id + ", Vehicle Type: " + vehicleType + ", Floor: " + floorNumber + ", Available: " + (isAvailable ? "Yes" : "No") + "]");
    }

}
