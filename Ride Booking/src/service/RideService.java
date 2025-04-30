package service;

import model.Ride;
import repository.RideRepoInerface;

public class RideService implements RideServiceInterface{

    RideRepoInerface rideRepoInerface;

    //remember this
    public RideService(RideRepoInerface rideRepoInerface) {
        this.rideRepoInerface = rideRepoInerface;
    }

    @Override
    public void createRide(Ride ride) {
        rideRepoInerface.createRide(ride);
    }

    @Override
    public void getRide(String rideId) {
        Ride ride = rideRepoInerface.getRide(rideId);
        System.out.println(ride);
    }
}
