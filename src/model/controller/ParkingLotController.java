package model.controller;

import model.*;
import model.builder.ParkingLot;
import model.factoty.Vehicle;
import model.factoty.VehicleType;

import java.time.LocalDateTime;
import java.util.List;

public class ParkingLotController {


    public ParkingLot createParkingLot(List<ParkingFloor> parkingFloorList, List<Operator> operatorList, List<Gate> gateList) {
        ParkingLot parkingLot = new ParkingLot.ParkingLotBuilder().withId(123).withAddress(new Address(854301, 234.678, 890.09)).withFloors(parkingFloorList).withGates(gateList).withOperators(operatorList).build();
        return parkingLot;

    }



    public ParkingSpot AssignParkingSpot (VehicleType vehicleType){

    ParkingLot parkingLot = ParkingLot.getParkingLotInstance();

    //get floors parkifloors
        List<ParkingFloor> allFloors = parkingLot.getParkifloors();
        for(int i=0; i<allFloors.size();i++ ){

            ParkingFloor floor = allFloors.get(i);

            // on this floor fetch all parkingSpots
            List<ParkingSpot> parkingSpotList =  floor.getParkingSpotList();
            for(int j=0; i< parkingSpotList.size(); j++){
                ParkingSpot parkingSpot = parkingSpotList.get(j);
                if(parkingSpot.getAvailable() && parkingSpot.getVehicleType()==vehicleType){
                    parkingSpot.setIsAvailable();
                    return parkingSpot;
                }
            }

        }

        return null;
    }


    public Bill issueBill(Ticket ticket,int amount, Operator operator){
        Bill bill = new Bill("1" , amount,ticket, LocalDateTime.now());
        System.out.println("Bill Issued to Customer Successfully");
        return bill;
    }

    public Ticket createTicket(VehicleType vehicleType, Vehicle vehicle, Gate gate, Operator operator){
        ParkingSpot parkingSpot = AssignParkingSpot(vehicleType);
//        Gate gate = new EntryGate(1,)
        Ticket ticket = new Ticket(parkingSpot,LocalDateTime.now(),vehicle,gate,operator);
        return ticket;
    }

}








