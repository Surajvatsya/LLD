package repository;

import model.User;

import java.util.HashMap;

public class UserRepo implements UserRepoInterface{

    private HashMap<String, User> userHashMap = new HashMap<>();
    @Override
    public void registerUser(User user) {
        if(userHashMap.containsKey(user.getId()))
            System.out.println("User already registered");
        else userHashMap.put(user.getId(), user);
    }

    @Override
    public User getUserById(String userId) {
        if(userHashMap.containsKey(userId))
            return userHashMap.get(userId);
        System.out.println("User not found");
        throw new IllegalArgumentException("User not found");
    }
}
