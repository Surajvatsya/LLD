package model.factoty;


public class VehicleFactory {
    public static Vehicle createVehicle(String type,String colour, String registrationNo){
        switch (type){
            case "car" : return new Car (colour,registrationNo,VehicleType.CAR);
            case "bike" : return new Bike(colour,registrationNo,VehicleType.BIKE);
            case "truck" : return new Truck(colour,registrationNo,VehicleType.TRUCK);
            default: throw new IllegalArgumentException("Please provide valid input");
        }

    }
}
