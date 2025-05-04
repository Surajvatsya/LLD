package repository;

import model.User;
// Optional: Define custom exceptions like UserNotFoundException, UserAlreadyExistsException here or in a separate exceptions package

public interface UserRepo {
    // Removed optional 'throws IllegalArgumentException'
    // Implementation should throw specific exception (e.g., UserAlreadyExistsException) on failure.
    void register(User user);

    // Removed optional 'throws IllegalArgumentException'
    // Implementation should return null or throw specific UserNotFoundException if not found.
    // Choosing to return User (potentially null) for now. Service layer must handle null.
    User getUserById(String userId);
}
