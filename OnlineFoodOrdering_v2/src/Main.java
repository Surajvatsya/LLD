import model.Address;
import model.Menu;
import model.Restaurant;
import model.User;
import repository.RestaurantRepo;
import repository.RestaurantrepoImp;
import repository.UserRepo;
import repository.UserRepoImp;
import service.RestaurantService;
import service.RestaurantServiceImpl;
import service.UserService;
import service.UserServiceImp;

import java.time.LocalDateTime;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.

        //repo
        UserRepo userRepo = new UserRepoImp();
        RestaurantRepo restaurantRepo = new RestaurantrepoImp();

        //services
        UserService userService = new UserServiceImp(userRepo);
        RestaurantService restaurantService = new RestaurantServiceImpl(restaurantRepo);

        //Address
        Address address = new Address("Kora",2.5,876542,9.9);

        //user
        User user = new User("U1", LocalDateTime.now(),"Suraj",address,"9876565432");

        userService.register(user);

        //Menu
        Menu menu = new Menu("M1",LocalDateTime.now(),"R1");
        //restaurant
        Restaurant restaurant = new Restaurant("R1",LocalDateTime.now(),"Manjhi","9098999999",menu,address);
        restaurantService.register(restaurant);


        System.out.println(user);
        System.out.println(restaurant);

    }
}