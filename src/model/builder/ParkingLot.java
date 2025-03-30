package model.builder;

import model.Address;
import model.Gate;
import model.Operator;
import model.ParkingFloor;

import java.util.List;

public class ParkingLot {
    private long id;
    private List<ParkingFloor> parkifloors;
    private List<Gate> lgs;
    private List<Operator> ops;
    private Address address;
    private static ParkingLot parkingLotInstance=null;

    public List<ParkingFloor> getParkifloors() {
        return parkifloors;
    }

    private ParkingLot(ParkingLotBuilder parkingLotBuilder) {
        this.id = parkingLotBuilder.id;
        this.parkifloors = parkingLotBuilder.parkifloors;
        this.lgs = parkingLotBuilder.lgs;
        this.ops = parkingLotBuilder.ops;
        this.address = parkingLotBuilder.address;
    }

    public static ParkingLot getParkingLotInstance() {
        return parkingLotInstance;
    }

    public static class ParkingLotBuilder{
        private long id;
        private List<ParkingFloor> parkifloors;
        private List<Gate> lgs;
        private List<Operator> ops;
        private Address address;

        public ParkingLotBuilder withId (long id){
            this.id = id;
            return this;
        }

        public ParkingLotBuilder withAddress (Address address){
            this.address = address;
            return this;
        }
        public ParkingLotBuilder withFloors (List<ParkingFloor> parkifloors){
            this.parkifloors = parkifloors;
            return this;
        }
        public ParkingLotBuilder withGates (List<Gate> lgs){
            this.lgs = lgs;
            return this;
        }
        public ParkingLotBuilder withOperators (List<Operator> ops){
            this.ops = ops;
            return this;
        }

        public ParkingLot build(){
            if(parkingLotInstance==null){
                parkingLotInstance =  new ParkingLot(this);
            }
            return parkingLotInstance;

        }
    }
}
