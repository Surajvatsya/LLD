package service;

import model.User;
import repository.UserRepository; // Updated import
import repository.UserSessionRepo;
import repository.UserSessionRepository; // Updated import

public class UserService implements GenericUserService {

    // Dependency injection
    private final UserRepository userRepository; // Updated type and name
    private final UserSessionRepository userSessionRepository; // Updated type and name

    public UserService(UserRepository userRepository, UserSessionRepository userSessionRepository) { // Updated parameter type and name
        this.userRepository = userRepository; // Updated assignment
        this.userSessionRepository = userSessionRepository; // Updated assignment
    }

    @Override
    public void register(User user) {
        // Consider adding try-catch for potential exceptions from repo
        userRepository.register(user); // Updated variable name
    }

    @Override
    // Add throws clause to match interface
    public void login(String userId) throws Exception { // Renamed parameter
        try {
            User user = userRepository.getUserById(userId); // Updated variable name & parameter usage
            // If user exists (no exception thrown), proceed to create session
            userSessionRepository.createSession(userId); // Updated variable name & parameter usage
        } catch (IllegalArgumentException e) { // Catch exception from repo if user not found
            // Handle user not found case - e.g., log error, maybe throw a LoginFailedException
            System.err.println("Login failed: " + e.getMessage());
            // Rethrow or throw a specific login exception
            throw new Exception("Login failed for user: " + userId, e); // Propagate exception
        }
        // Session creation happens only on success (inside try)
    }

    @Override
    // Change return type to boolean and return true (assuming success if no exception)
    public boolean logout(String userId) {
        // Consider adding null check for userId before calling repo
        // Assuming removeSession throws if it fails, otherwise succeeds.
        // A more robust implementation might involve checking session existence
        // or having removeSession return a boolean.
        try {
             userSessionRepository.removeSession(userId); // Updated variable name
             return true; // Indicate success
        } catch (Exception e) {
            // Log error, handle specific exceptions if repository throws them
            System.err.println("Logout failed for user " + userId + ": " + e.getMessage());
            return false; // Indicate failure
        }
    }

}
