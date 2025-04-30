package repository;

import model.Ride;

public interface RideRepoInerface {
    void createRide(Ride ride);
    Ride getRide(String rideId);
}
