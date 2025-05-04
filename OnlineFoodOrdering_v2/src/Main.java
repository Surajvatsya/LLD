import controller.RestaurantController; // Added controller import
import controller.UserController;       // Added controller import
import model.*; // Import all models
import repository.RestaurantRepo;
import repository.RestaurantRepoImp; // Fixed import typo
import repository.UserRepo;
import repository.UserRepoImp;
import service.RestaurantService;
import service.RestaurantServiceImpl;
import service.UserService;
import service.UserServiceImp;

import java.math.BigDecimal; // Added import for price
import java.time.LocalDateTime;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("--- Online Food Ordering System Demo ---");

        // --- Setup ---
        // Repositories (In-memory)
        UserRepo userRepo = new UserRepoImp();
        RestaurantRepo restaurantRepo = new RestaurantRepoImp(); // Fixed class name typo

        // Services
        UserService userService = new UserServiceImp(userRepo);
        RestaurantService restaurantService = new RestaurantServiceImpl(restaurantRepo);

        // Controllers
        UserController userController = new UserController(userService);
        RestaurantController restaurantController = new RestaurantController(restaurantService);

        // --- Data Creation ---
        // Address
        // Updated constructor parameter order: name, lat, lon, pincode
        Address address1 = new Address("123 Food St", 12.9716, 77.5946, 560001);
        Address address2 = new Address("456 Eatery Ave", 12.9721, 77.5950, 560002);

        // User
        User user1 = new User("U1", LocalDateTime.now(), "Suraj", address1, "9876543210");
        try {
            userController.register(user1); // Use controller
            System.out.println("\nUser Registered: " + userController.getUserById("U1"));
        } catch (Exception e) {
            System.err.println("Error registering user: " + e.getMessage());
        }
         // Try registering duplicate user
        try {
            User duplicateUser = new User("U1", LocalDateTime.now(), "Suraj Clone", address1, "9876543211");
            userController.register(duplicateUser);
        } catch (Exception e) {
            System.err.println("Expected error registering duplicate user: " + e.getMessage());
        }


        // Menu & Items
        Menu menu1 = new Menu("M1", LocalDateTime.now(), "R1");
        Item item1 = new Item("I1", LocalDateTime.now(), "Veg Pizza", true, 10, new BigDecimal("250.00"));
        Item item2 = new Item("I2", LocalDateTime.now(), "Chicken Burger", false, 5, new BigDecimal("180.50"));
        Item item3 = new Item("I3", LocalDateTime.now(), "Coke", true, 20, new BigDecimal("50.00"));
        menu1.addItem(item1);
        menu1.addItem(item2);
        menu1.addItem(item3);

        // Restaurant
        Restaurant restaurant1 = new Restaurant("R1", LocalDateTime.now(), "Pizza Place", "9000011111", menu1, address1);
        restaurant1.addServiceArea(address1); // Add service area
        restaurant1.addServiceArea(address2);
        try {
            restaurantController.addRestaurant(restaurant1); // Use controller
            System.out.println("\nRestaurant Registered: " + restaurantController.getRestaurantById("R1"));
            System.out.println("Service Areas: " + restaurantController.getRestaurantById("R1").getServiceAreas());
            System.out.println("Menu Items: " + restaurantController.getRestaurantById("R1").getMenu().getItemList());
        } catch (Exception e) {
            System.err.println("Error registering restaurant: " + e.getMessage());
        }

        // --- Order Simulation ---
        System.out.println("\n--- Placing Order ---");
        Order order1 = new Order("O1", LocalDateTime.now(), user1.getId(), restaurant1.getId());
        try {
            // Simulate adding items to order
            Item orderedItem1 = restaurantController.getRestaurantById("R1").getMenu().getItemList().get(0); // Get Veg Pizza
            Item orderedItem3 = restaurantController.getRestaurantById("R1").getMenu().getItemList().get(2); // Get Coke

            // Check available quantity before adding (Ideally service layer handles this)
            if (orderedItem1.getAvailableQuantity() >= 2) {
                 order1.addItem(orderedItem1, 2); // Order 2 pizzas
                 // Decrease quantity in the item (Ideally service layer handles this)
                 // orderedItem1.decreaseQuantity(2); // This would modify the item in the menu directly! Needs better handling.
                 System.out.println("Added 2 " + orderedItem1.getName());
            } else {
                 System.out.println("Insufficient quantity for " + orderedItem1.getName());
            }

            if (orderedItem3.getAvailableQuantity() >= 3) {
                order1.addItem(orderedItem3, 3); // Order 3 cokes
                System.out.println("Added 3 " + orderedItem3.getName());
            } else {
                 System.out.println("Insufficient quantity for " + orderedItem3.getName());
            }


            System.out.println("Order Details: " + order1);
            System.out.println("Order Total: " + order1.getTotalAmount());

            // Add order to user's list
            user1.addOrder(order1);
            System.out.println("\nUser after order: " + userController.getUserById("U1")); // Fetch updated user

        } catch (Exception e) {
            System.err.println("Error processing order: " + e.getMessage());
            e.printStackTrace(); // Print stack trace for detailed error
        }

        System.out.println("\n--- Demo End ---");
    }
}
