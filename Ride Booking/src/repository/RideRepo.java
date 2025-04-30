package repository;

import model.Ride;

import java.util.HashMap;

public class RideRepo implements RideRepoInerface{

    private HashMap<String, Ride> rideHashMap = new HashMap<>();
    @Override
    public void createRide(Ride ride) {
    rideHashMap.put(ride.getId(), ride);
    }

    @Override
    public Ride getRide(String rideId) {
    return rideHashMap.get(rideId);
    }
}
