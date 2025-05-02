import controller.UserController;
import model.*; // Imports Address, User, Item, Menu, Restaurant, Order, OrderStatus etc.
import repository.UserRepository; // Updated import
import repository.UserRepo;
import repository.UserSessionRepo;
import repository.UserSessionRepository; // Updated import
import service.UserService;
import java.math.BigDecimal; // Added import
// Need to import RestaurantService and RestaurantController if used later
// import service.RestaurantService;
// import controller.RestaurantController;

import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {



        //register user
//        UserRepo userRepoImpl = new UserRepo(); // Use specific type for instantiation
//        UserRepository userRepository = userRepoImpl; // Assign to interface type
//        UserSessionRepository userSession = new UserSessionRepo(); // Updated type
//        UserService userService = new UserService(userRepository, userSession); // Use updated type
//        UserController userController = new UserController(userService);
        Address address1 = new Address("Koramangala",  3445.31, 876543.31, 234);
//        Address address2 = new Address("5th Block",234.44,3445.33,876543);
        User user1 = new User("1", "Moti", "+91 7654323441", "email", address1);

        // --- Example: Create and add an order to user1's history ---
        // Create a dummy list of items for the order
        List<Item> orderItems = new ArrayList<>();
        // Updated Item constructor call: requires BigDecimal price
        // Assuming price is 150.00 for Biryani
        orderItems.add(new Item("I1", "Biryani", new BigDecimal("150.00"), 1, false)); // Assuming quantity 1 for the order item

        // Create a sample order (replace dummy values as needed)
        // Note: Order constructor expects: id, userId, totalAmount, orderStatus, dishList, restaurantId
        Order sampleOrder = new Order("order123", user1.getId(), 150.00, OrderStatus.PENDING, orderItems, "rest456");

        // Add the order to the user's history
        user1.addOrderToHistory(sampleOrder);

        // user1.

        System.out.println("Added order " + sampleOrder.getId() + " to user " + user1.getName() + "'s history.");
        System.out.println("User's order history size before clear: " + user1.getOrderHistory().size());

        // --- Example: Clear the order history ---
        // Get the direct reference (since getOrderHistory currently returns it)
        List<Order> historyRef = user1.getOrderHistory();
        // Clear the list using the reference
        historyRef.clear();
        System.out.println("Cleared the user's order history.");
        System.out.println("User's order history size after clear: " + user1.getOrderHistory().size());
        // Note: If getOrderHistory returned an unmodifiable list, historyRef.clear() would throw an exception.
        // --- End Example ---

//        userController.registerUser(user1);
//        userController.login(user1.getId());
//        Item item1 = new Item("I1","Biryani",100,false,true);
//        Item item2 = new Item("I2","Dosha",100,true,true);
//        List<Item> items = new ArrayList<>();
//        items.add(item1);
//        items.add(item2);
//
////        Use Option 1 — instantiate Restaurant first, then inject Menu via setMenu().
//        Menu menu = new Menu(items,"M1");
//
//        Restaurant restaurant = new Restaurant("R1", "Meghna Biryani", address2, menu);
//
//        // Removed incomplete line: restaurant.se
//        System.out.println("User " + user1.getName() + " registered and logged in.");
//        // Add more test code here to use RestaurantController, OrderService etc.

    }
}
