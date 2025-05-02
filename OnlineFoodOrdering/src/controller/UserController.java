package controller;

import model.User;
import service.GenericUserService;

public class UserController {

    private final GenericUserService userService; // Made final

    public UserController(GenericUserService userService) {
        this.userService = userService;
    }

    public void registerUser(User user){
        userService.register(user);
    }
    public void login(String userId){
        try {
            userService.login(userId);
            System.out.println("User " + userId + " logged in successfully."); // Optional success message
        } catch (Exception e) {
            // Handle login exception (e.g., log, inform caller)
            System.err.println("Login failed for user " + userId + ": " + e.getMessage());
            // Depending on requirements, might re-throw a controller-level exception
        }
    }
    // Update logout to return boolean status from service
    public boolean logout(String userId){ // Renamed from logOut
        boolean success = userService.logout(userId);
        if (success) {
            System.out.println("User " + userId + " logged out successfully."); // Optional success message
        } else {
            System.err.println("Logout failed for user " + userId + "."); // Optional failure message
        }
        return success;
    }
}
