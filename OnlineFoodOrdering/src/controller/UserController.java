package controller;

import model.User;
import service.GenericUserService;
import exception.LogoutFailedException; // Add import for logout exception

public class UserController {

    private final GenericUserService userService; // Made final

    public UserController(GenericUserService userService) {
        // Add null check for dependency
        if (userService == null) {
            throw new IllegalStateException("GenericUserService cannot be null.");
        }
        this.userService = userService;
    }

    // Add placeholder exception handling (assuming service might throw eventually)
    public void registerUser(User user) {
        // Input validation
        if (user == null) {
            throw new IllegalArgumentException("User object cannot be null for registration.");
        }
        // Add more specific validation for User fields if needed

        try {
            // TODO: Update service layer (GenericUserService.register) to throw specific exceptions
            userService.register(user);
            System.out.println("User registered successfully (ID: " + user.getId() + ")"); // Logging placeholder
        } catch (Exception e) {
            // Placeholder: Catch generic exception until service layer is updated
            System.err.println("User registration failed: " + e.getMessage()); // Logging placeholder
            // Re-throw as a runtime exception for now, or define a controller-level exception
            throw new RuntimeException("User registration failed: " + e.getMessage(), e);
        }
    }

    // Update to re-throw service exception
    public void login(String userId) throws Exception { // Declare throws Exception from service
        // Input validation
        if (userId == null || userId.trim().isEmpty()) {
            throw new IllegalArgumentException("User ID cannot be null or empty for login.");
        }
        try {
            userService.login(userId); // Service method already declares throws Exception
            System.out.println("User " + userId + " logged in successfully."); // Logging placeholder
        } catch (Exception e) {
            // Handle login exception (e.g., log, inform caller)
            System.err.println("Login failed for user " + userId + ": " + e.getMessage()); // Logging placeholder
            // Re-throw the exception from the service layer
            throw e;
        }
    }

    // Update logout to return void and throw exception on failure
    public void logout(String userId) throws LogoutFailedException {
        // Input validation
        if (userId == null || userId.trim().isEmpty()) {
            throw new IllegalArgumentException("User ID cannot be null or empty for logout.");
        }

        // Service method returns boolean, convert failure to exception
        boolean success = userService.logout(userId);
        if (success) {
            System.out.println("User " + userId + " logged out successfully."); // Logging placeholder
        } else {
            System.err.println("Logout failed for user " + userId + "."); // Logging placeholder
            // Throw specific exception on failure
            throw new LogoutFailedException("Logout failed for user " + userId);
        }
        // No return value needed
    }
}
