package repository;

import model.User;

import java.util.concurrent.ConcurrentHashMap;

public class UserRepoImp implements UserRepo{

    private final ConcurrentHashMap<String, User> userMap ;

    public UserRepoImp() {
        userMap = new ConcurrentHashMap<>();
    }

    @Override
    // Removed throws declaration
    public void register(User user) {
        // Removed redundant null check (controller/service should handle)
        // if(user==null || user.getId()==null){
        //     throw  new IllegalArgumentException("Invalid user data");
        // }

        // Use putIfAbsent for atomic check-and-put, prevent overwriting
        // Throw exception if user already exists
        if (userMap.putIfAbsent(user.getId(), user) != null) {
            // Consider creating a specific UserAlreadyExistsException
            throw new IllegalArgumentException("User with ID " + user.getId() + " already exists.");
        }
        // Removed old: userMap.put(user.getId(),user);
        // Removed comment: // rem throw new ...
    }

    @Override
    // Removed throws declaration
    public User getUserById(String userId) {
        // Removed commented-out null check for userId (service/controller should handle)
        // if(userId==null)
        //     throw new IllegalArgumentException("Invalid UserId");

        // Get user from map
        User user = userMap.get(userId);

        // Return null if user not found (instead of throwing IllegalArgumentException)
        // Service layer is responsible for handling the null case
        // Removed old:
        // if(user==null)
        //     throw new IllegalArgumentException("Invalid UserId");
        return user;
    }
}
