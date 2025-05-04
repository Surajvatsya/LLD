package service;

import model.User;
// Optional: Define custom exceptions like UserNotFoundException, UserAlreadyExistsException here or in a separate exceptions package

public interface UserService {
    // Removed optional 'throws IllegalArgumentException' for unchecked exceptions
    void register(User user);

    // Consider changing return type to Optional<User> or throwing a specific UserNotFoundException
    User getUserById(String id);
}
