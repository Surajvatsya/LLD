import controller.UserController;
import model.*;
import repository.UserRepo;
import repository.UserRepoInterface;
import service.UserService;
import service.UserServiceInterface;

import java.time.LocalDateTime;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //create userRepo object
        UserRepoInterface userRepoInterface = new UserRepo();

        //create userService
        UserServiceInterface userServiceInterface = new UserService(userRepoInterface);

        //craete userController
        UserController userController = new UserController(userServiceInterface);



        User passenger = new Passenger("1","user1","9876543221");
        User driver = new Passenger("D1","driver1","9876543221");
        userController.createUser(passenger);
        userController.createUser(driver);
        userController.getuser("1");


        Ride ride = new Ride("R1", LocalDateTime.now().plusMinutes(30),12,2,PaymentMode.PAY_AT_DESTINATION,RideStatus.PENDING,"1","D1");
        Payment payment = new Payment("P1",PaymentStatus.PENDING,12,"R1");
        Booking booking = new Booking("B1","R1","1","UPI","P1");
        passenger.addBooking(booking);
//        passenger.getBooking("B1");
//        ride.


    }
}