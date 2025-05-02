package repository;

import model.User;

/**
 * Interface defining data access operations for User entities.
 */
public interface UserRepository { // Renamed from GenericUser

    /**
     * Registers a new user.
     * Implementations should handle potential duplicate IDs.
     * @param user The user object to register. Must not be null, and user.getId() must not be null.
     * @throws IllegalArgumentException if the user or user ID is null, or if a user with the same ID already exists.
     *                                  Consider using a more specific UserAlreadyExistsException.
     */
    void register(User user);

    /**
     * Retrieves a user by their unique ID.
     * @param userId The ID of the user to retrieve. Must not be null.
     * @return The User object if found.
     * @throws IllegalArgumentException if userId is null or if no user is found for the given ID.
     *                                  Consider using a more specific UserNotFoundException.
     */
    User getUserById(String userId);

    // TODO: Consider adding other methods like update(User user), delete(String userId), findByEmail(String email) etc.
}
