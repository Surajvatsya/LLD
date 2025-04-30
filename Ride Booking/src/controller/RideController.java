package controller;

import model.Ride;
import service.RideServiceInterface;

public class RideController {

    private RideServiceInterface rideServiceInterface;

    public RideController(RideServiceInterface rideServiceInterface) {
        this.rideServiceInterface = rideServiceInterface;
    }

    public void bookRide(Ride ride){
        rideServiceInterface.createRide(ride);
    }

    public void getRide(String rideId){
        rideServiceInterface.getRide(rideId);
    }
}
