package model;

public class Driver extends User{

    private String vehicleNumber;
    private VehicleType vehicleType;

    public Driver(String id, String name, String mob, String vehicleNumber, VehicleType vehicleType) {
        super(id, name, mob);
        this.vehicleNumber = vehicleNumber;
        this.vehicleType = vehicleType;
    }

    public String getVehicleNumber() {
        return vehicleNumber;
    }
}
