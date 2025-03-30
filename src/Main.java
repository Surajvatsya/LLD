import model.*;
import model.controller.ParkingLotController;

import model.factoty.*;
import model.builder.*;

import model.factoty.*;

import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ParkingLotController parkingLotController = new ParkingLotController();
        List<ParkingSpot> parkingSpots1  = new ArrayList<>();
        List< ParkingSpot> parkingSpots2  = new ArrayList<>();
        List< ParkingSpot> parkingSpots3 = new ArrayList<>();
        for(int i=1;i<=3;i++){

            ParkingSpot parkingSpot = new ParkingSpot("i", VehicleType.CAR,1);
            //correct i
            parkingSpots1.add(parkingSpot);
            parkingSpot.displayParkingSpot();
        }
        for(int i=1;i<=3;i++){
            ParkingSpot parkingSpot = new ParkingSpot("i", VehicleType.BIKE,2);

            parkingSpots2.add(parkingSpot);
            parkingSpot.displayParkingSpot();

        }
        for(int i=1;i<=3;i++){
            ParkingSpot parkingSpot = new ParkingSpot("i", VehicleType.TRUCK,3);
            parkingSpots3.add(parkingSpot);
            parkingSpot.displayParkingSpot();

        }



        List< ParkingFloor> parkingFloors = new ArrayList<>();
        parkingFloors.add(new ParkingFloor("1",parkingSpots1));
        parkingFloors.add(new ParkingFloor("2",parkingSpots2));
        parkingFloors.add(new ParkingFloor("3",parkingSpots3));

        Address address = new Address(533102,100,200);
        Operator operator1 = new Operator(1,"Vamsi", "contact");
        Operator operator2 = new Operator(2,"Suraj", "contact");

        List<Gate> gates = new ArrayList<>();
        gates.add(new EntryGate(1,operator1));
        gates.add(new ExitGate(2,operator2));

//        ParkingLot parkingLot = parkingLotController.createParkingLot(parkingFloors,address,gates);




    }
}