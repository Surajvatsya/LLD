import controller.UserController;
import model.*;
import repository.GenericUser;
import repository.UserRepo;
import repository.UserSessionRepo;
import repository.genericUserSession;
import service.UserService;

import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {



        //register user
//        UserRepo userRepo = new UserRepo();
        GenericUser userRepo = new UserRepo();
        genericUserSession userSession = new UserSessionRepo();
        UserService userService = new UserService(userRepo,userSession);
        UserController userController = new UserController(userService);
        Address address1 = new Address("Koramangala",234.44,3445.33,876543);
        Address address2 = new Address("5th Block",234.44,3445.33,876543);
        User user1 = new User("1","Moti","+91 7654323441","email",address1);
        userController.registerUser(user1);
        userController.login(user1.getId());
        Item item1 = new Item("I1","Biryani",100,false,true);
        Item item2 = new Item("I2","Dosha",100,true,true);
        List<Item> items = new ArrayList<>();
        items.add(item1);
        items.add(item2);

//        Use Option 1 — instantiate Restaurant first, then inject Menu via setMenu().
        Menu menu = new Menu(items,"M1");

        Restaurant restaurant = new Restaurant("R1","Meghna Biryani",address2,menu);

        restaurant.se


    }
}