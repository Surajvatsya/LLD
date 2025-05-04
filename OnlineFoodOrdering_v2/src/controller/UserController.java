package controller;

import model.User;
import service.UserService;

public class UserController {
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    // Make method public and remove redundant try-catch
    public void register(User user){
        if(user == null || user.getId()==null){
            throw  new IllegalArgumentException("Invalid user data provided to controller."); // Slightly more specific message
        }
        // Add try-catch for RuntimeExceptions from service layer
        try {
            userService.register(user);
        } catch (RuntimeException e) {
            // Log the exception here if needed
            System.err.println("Error during user registration in controller: " + e.getMessage());
            // Re-throw the exception to propagate it to the caller (e.g., Main)
            throw e;
        }
    }

    // Make method public and add try-catch
    public User getUserById(String id){
        if(id == null) {
            throw new IllegalArgumentException("Invalid user ID provided to controller."); // Slightly more specific message
        }
        // Add try-catch for RuntimeExceptions from service layer
        try {
            // Service layer should handle null from repo and potentially throw UserNotFoundException
            return userService.getUserById(id);
        } catch (RuntimeException e) {
            // Log the exception here if needed
            System.err.println("Error fetching user by ID in controller: " + e.getMessage());
            // Re-throw the exception to propagate it to the caller (e.g., Main)
            throw e;
        }
    }
}
