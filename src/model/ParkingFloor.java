package model;

import java.util.ArrayList;
import java.util.List;

public class ParkingFloor {

    private String floorNo;
    private Boolean isFloorFull;
    private List<ParkingSpot> parkingSpotList;

    public ParkingFloor(String floorNo, List<ParkingSpot> parkingSpotList) {
        this.floorNo = floorNo;
        this.isFloorFull = false;
        this.parkingSpotList = parkingSpotList==null ? new ArrayList<>() : parkingSpotList;
    }

    public List<ParkingSpot> getParkingSpotList() {
        return parkingSpotList;
    }
}
