package service;

import model.Ride;

public interface RideServiceInterface {
    void createRide(Ride ride);
    void getRide(String rideId);
}
