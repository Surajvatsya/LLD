package repository;

import model.User; // Removed duplicate import

import java.util.HashMap;
// Consider using ConcurrentHashMap for thread safety if needed
// import java.util.concurrent.ConcurrentHashMap;
// import java.util.concurrent.ConcurrentMap;
// Consider using ConcurrentHashMap for thread safety if needed
 // import java.util.concurrent.ConcurrentHashMap;
 // import java.util.concurrent.ConcurrentMap;

public class UserRepo implements UserRepository { // Updated interface name
    // private final ConcurrentMap<String, User> userMap = new ConcurrentHashMap<>();
    private final HashMap<String, User> userHashMap; // Made final

    @Override
    public void register(User user) {
        if (user == null || user.getId() == null) {
            throw new IllegalArgumentException("User and User ID cannot be null.");
        }
        // Throw exception if user ID already exists
        if (userHashMap.containsKey(user.getId())) {
            throw new IllegalArgumentException("User with ID " + user.getId() + " already exists.");
        }
        userHashMap.put(user.getId(), user);
    }

    public UserRepo() {
        this.userHashMap = new HashMap<>();
    }

    @Override
    public User getUserById(String userId) {
        if (userId == null) {
             throw new IllegalArgumentException("User ID cannot be null.");
        }
        User user = userHashMap.get(userId);
        if (user == null) {
            // Throw exception if user not found
            throw new IllegalArgumentException("User with ID " + userId + " not found.");
            // Consider creating and throwing a specific UserNotFoundException
        }
        return user;
    }
}
