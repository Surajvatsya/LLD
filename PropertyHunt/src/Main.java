//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

//IMPLEMENT SINGELTON IN REGISTRATION

import controller.PropertyController;
import controller.UserController;
import model.*;
import repository.UserRepository;
import repository.UserRepositoryHashMap;
import repository.UserSessionManager;
import repository.UserSessionManagerWithHashSet;
import service.GenericUserService;
import service.UserServiceHashMap;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {


        //userRepo DB bnaya (hashmap class  concrete)
        UserRepository userRepo = new UserRepositoryHashMap();
        UserSessionManagerWithHashSet userSessionManagerWithHashSet = new UserSessionManagerWithHashSet();
        GenericUserService userService = new UserServiceHashMap(userRepo, userSessionManagerWithHashSet);

//        UserSessionManager userSessionManager = new UserSessionManager();


        Room room1 = Room.BHK_2;
        Room room2 = Room.BHK_1;
        List<Room> rooms = new ArrayList<>();
        rooms.add(room1);
        rooms.add(room2);
        Address address = new Address("12345","X Residency","Near sarathy Hospital", 23.98,90.87);
        Address address1 = new Address("12346","Y Residency","City Mall", 23.98,90.87);
        Address address2 = new Address("12347","Z Residency","Metro Station", 23.98,90.87);
        List<Address> nearByLandMarks = new ArrayList<>();
        nearByLandMarks.add(address1);
        nearByLandMarks.add(address2);

        User user = new User(12345,"Vamsi Bro","7424948001");
        UserController userController = new UserController(userService);

        // this userController is having reference of
        userController.register(user);
        userController.login(user.getContact());


        Property property = new Property(12345, LocalDateTime.now(),LocalDateTime.now(),2000.590,"sq ft",rooms,true, PropertyType.RENT, PropertyStatus.READY_TO_MOVE,address,user,nearByLandMarks,20000000);
        PropertyController propertyController = new PropertyController();
//        propertyController.createProperty(property);
//        Property user1Property = propertyController.getPropertyById(12345,user);
//        System.out.println("Property with propertyId" + user1Property.getId() + user1Property.getPropertySize() + user1Property.getAddress() + user1Property.getUser());


    }
}