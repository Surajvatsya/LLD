// Removed incorrect package declaration

// Specific Imports
import controller.RestaurantController;
import controller.UserController;
import exception.LogoutFailedException;
import exception.RestaurantNotFoundException;
import exception.RestaurantRegistrationException;
import model.Address;
import model.Restaurant;
import model.User;
// Import repository implementations (adjust names if different)
import repository.OrderRepo;
import repository.RestaurantRepo;
import repository.ReviewRepo;
import repository.UserRepo;
import repository.UserSessionRepo;
import repository.GenericReview; // Add import
// Import repository interfaces
import repository.OrderRepository;
import repository.RestaurantRepository;
// import repository.ReviewRepository; // Commented out as it likely doesn't exist yet
import repository.UserRepository;
import repository.UserSessionRepository;
// Import service implementations (adjust names if different)
import service.OrderService;
import service.RestaurantService;
import service.ReviewService; // Assuming this exists
import service.UserService;
// Import service interfaces
import service.GenericOrderService;
import service.GenericRestaurantService;
import service.GenericReviewService; // Assuming this exists
import service.GenericUserService;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        System.out.println("--- Online Food Ordering App Initializing ---");

        // ==================================
        // Dependency Injection Setup (Manual)
        // ==================================
        System.out.println("Setting up repositories...");
        UserRepository userRepository = new UserRepo();
        UserSessionRepository userSessionRepository = new UserSessionRepo();
        RestaurantRepository restaurantRepository = new RestaurantRepo();
        GenericReview reviewRepository = new ReviewRepo(); // Using GenericReview for now

        System.out.println("Setting up services...");
        GenericUserService userService = new UserService(userRepository, userSessionRepository);
        GenericRestaurantService restaurantService = new RestaurantService(restaurantRepository);
        GenericReviewService reviewService = new ReviewService(); // Needs DI fix
        // TODO: Update ReviewService constructor for dependency injection: new ReviewService(reviewRepository)

        System.out.println("Setting up controllers...");
        UserController userController = new UserController(userService);
        RestaurantController restaurantController = new RestaurantController(restaurantService);
        // TODO: Instantiate ReviewController

        System.out.println("--- Initialization Complete ---");
        System.out.println();

        // ==================================
        // Application Demo / Test Cases
        // ==================================

        // --- User Operations ---
        System.out.println("--- User Operations Test Cases ---");
        Address address1 = new Address("Koramangala", 3445.31, 876543.31, 234);
        User user1 = new User("user001", "Alice", "+919876543210", "alice@example.com", address1);
        User userNullName = new User("user002", null, "+911111111111", "bob@example.com", address1);
        User userNull = null;

        // Test Case 1: Register Valid User (Success Expected)
        System.out.println("\nTest Case 1: Register Valid User");
        try {
            userController.registerUser(user1);
        } catch (RuntimeException e) {
            System.err.println("-> TEST FAILED (Unexpected Error): " + e.getMessage());
        }

        // Test Case 2: Register Null User (Fail Expected - IllegalArgumentException from Controller)
        System.out.println("\nTest Case 2: Register Null User");
        try {
            userController.registerUser(userNull);
        } catch (IllegalArgumentException e) {
            System.out.println("-> TEST PASSED (Caught Expected): " + e.getMessage());
        } catch (RuntimeException e) {
            System.err.println("-> TEST FAILED (Caught Unexpected): " + e.getMessage());
        }

        // Test Case 3: Register Duplicate User (Fail Expected - RuntimeException from Controller, ideally specific)
        System.out.println("\nTest Case 3: Register Duplicate User");
        try {
            userController.registerUser(user1); // Try registering Alice again
        } catch (RuntimeException e) { // TODO: Catch specific UserRegistrationException when implemented
            System.out.println("-> TEST PASSED (Caught Expected Error): " + e.getMessage());
        }

        // Test Case 4: Login Valid User (Success Expected)
        System.out.println("\nTest Case 4: Login Valid User");
        try {
            userController.login(user1.getId());
        } catch (Exception e) {
            System.err.println("-> TEST FAILED (Unexpected Error): " + e.getMessage());
        }

        // Test Case 5: Login Non-Existent User (Fail Expected - Exception from Controller/Service)
        System.out.println("\nTest Case 5: Login Non-Existent User");
        try {
            userController.login("nonexistent_user");
        } catch (Exception e) { // TODO: Catch specific UserNotFound/Authentication exception
            System.out.println("-> TEST PASSED (Caught Expected Error): " + e.getMessage());
        }

        // Test Case 6: Login with Null ID (Fail Expected - IllegalArgumentException from Controller)
        System.out.println("\nTest Case 6: Login with Null ID");
        try {
            userController.login(null);
        } catch (IllegalArgumentException e) {
            System.out.println("-> TEST PASSED (Caught Expected): " + e.getMessage());
        } catch (Exception e) {
             System.err.println("-> TEST FAILED (Caught Unexpected): " + e.getMessage());
        }

        // Test Case 7: Logout Valid User (Success Expected)
        System.out.println("\nTest Case 7: Logout Valid User");
        try {
            userController.logout(user1.getId());
        } catch (LogoutFailedException | IllegalArgumentException e) {
             System.err.println("-> TEST FAILED (Unexpected Error): " + e.getMessage());
        }

        // Test Case 8: Logout Non-Existent/Logged-Out User (Fail Expected - LogoutFailedException from Controller)
        System.out.println("\nTest Case 8: Logout Non-Existent/Logged-Out User");
        try {
            userController.logout("nonexistent_user");
        } catch (LogoutFailedException e) {
             System.out.println("-> TEST PASSED (Caught Expected): " + e.getMessage());
        } catch (IllegalArgumentException e) {
             System.err.println("-> TEST FAILED (Caught Unexpected): " + e.getMessage());
        }

        // Test Case 9: Logout with Null ID (Fail Expected - IllegalArgumentException from Controller)
        System.out.println("\nTest Case 9: Logout with Null ID");
         try {
            userController.logout(null);
        } catch (IllegalArgumentException e) {
             System.out.println("-> TEST PASSED (Caught Expected): " + e.getMessage());
        } catch (LogoutFailedException e) {
             System.err.println("-> TEST FAILED (Caught Unexpected): " + e.getMessage());
        }
        System.out.println();


        // --- Restaurant Operations ---
        System.out.println("--- Restaurant Operations Test Cases ---");
        Address address2 = new Address("Indiranagar", 12.97, 77.64, 560038);
        Restaurant restaurant1 = new Restaurant("rest001", "Meghana Foods", address2, null); // Passing null for menu for simplicity
        Restaurant restaurantNullName = new Restaurant("rest002", null, address2, null);
        Restaurant restaurantNull = null;

        // Test Case 10: Register Valid Restaurant (Success Expected)
        System.out.println("\nTest Case 10: Register Valid Restaurant");
        try {
            restaurantController.createRestaurant(restaurant1);
        } catch (RestaurantRegistrationException | IllegalArgumentException e) {
             System.err.println("-> TEST FAILED (Unexpected Error): " + e.getMessage());
        }

        // Test Case 11: Register Null Restaurant (Fail Expected - IllegalArgumentException from Controller)
        System.out.println("\nTest Case 11: Register Null Restaurant");
         try {
            restaurantController.createRestaurant(restaurantNull);
        } catch (IllegalArgumentException e) {
             System.out.println("-> TEST PASSED (Caught Expected): " + e.getMessage());
        } catch (RestaurantRegistrationException e) {
             System.err.println("-> TEST FAILED (Caught Unexpected): " + e.getMessage());
        }

       // Test Case 12: Register Restaurant with Null Name (Fail Expected - RestaurantRegistrationException from Service)
       System.out.println("\nTest Case 12: Register Restaurant with Null Name");
        try {
            restaurantController.createRestaurant(restaurantNullName);
        } catch (RestaurantRegistrationException e) {
            System.out.println("-> TEST PASSED (Caught Expected): " + e.getMessage());
        } catch (IllegalArgumentException e) {
             System.err.println("-> TEST FAILED (Caught Unexpected): " + e.getMessage());
        }

        // Test Case 13: Register Duplicate Restaurant (Fail Expected - RestaurantRegistrationException from Controller/Service)
        System.out.println("\nTest Case 13: Register Duplicate Restaurant");
        try {
            restaurantController.createRestaurant(restaurant1); // Try registering again
        } catch (RestaurantRegistrationException e) {
            System.out.println("-> TEST PASSED (Caught Expected Error): " + e.getMessage());
        } catch (IllegalArgumentException e) {
             System.err.println("-> TEST FAILED (Caught Unexpected): " + e.getMessage());
        }

        // Test Case 14: Get Existing Restaurant (Success Expected)
        System.out.println("\nTest Case 14: Get Existing Restaurant");
        try {
            Restaurant fetchedRestaurant = restaurantController.getRestaurantById("rest001");
            if (fetchedRestaurant != null) {
                System.out.println("-> TEST PASSED: Successfully fetched restaurant: " + fetchedRestaurant.getName());
            } else {
                 System.err.println("-> TEST FAILED: Fetched null for existing restaurant.");
            }
        } catch (RestaurantNotFoundException | IllegalArgumentException e) {
            System.err.println("-> TEST FAILED (Unexpected Error): " + e.getMessage());
        }

        // Test Case 15: Get Non-Existent Restaurant (Fail Expected - RestaurantNotFoundException from Controller/Service)
        System.out.println("\nTest Case 15: Get Non-Existent Restaurant");
        try {
            restaurantController.getRestaurantById("nonexistent_rest");
             System.err.println("-> TEST FAILED: Did not throw exception for non-existent restaurant.");
        } catch (RestaurantNotFoundException e) {
            System.out.println("-> TEST PASSED (Caught Expected): " + e.getMessage());
        } catch (IllegalArgumentException e) {
             System.err.println("-> TEST FAILED (Caught Unexpected): " + e.getMessage());
        }

        // Test Case 16: Get Restaurant with Null ID (Fail Expected - IllegalArgumentException from Controller)
        System.out.println("\nTest Case 16: Get Restaurant with Null ID");
        try {
            restaurantController.getRestaurantById(null);
             System.err.println("-> TEST FAILED: Did not throw exception for null ID.");
        } catch (IllegalArgumentException e) {
            System.out.println("-> TEST PASSED (Caught Expected): " + e.getMessage());
        } catch (RestaurantNotFoundException e) {
             System.err.println("-> TEST FAILED (Caught Unexpected): " + e.getMessage());
        }

        System.out.println();
        System.out.println("--- Application Demo Finished ---");

        // Note: The issue with User.getOrderHistory() returning a mutable list
        // should be addressed within the User class itself for proper encapsulation.
    }
}
