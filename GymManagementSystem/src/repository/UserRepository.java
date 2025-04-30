package repository;

import model.User;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class UserRepository implements GenericUserRepository{

    private HashMap<String, User> userHashMap = new HashMap<>();

    @Override
    public void registerUser(User user) {
        userHashMap.put(user.getId(),user);
        System.out.println("User SuccessFully Registered");
    }

    @Override
    public List<User> getAllUsers() {
        List<User> users = new ArrayList<>();
        for(User user: userHashMap.values()){{
            users.add(user);
        }}
        return users;
    }

    @Override
    public User getUserById(String userId) {
        if(userHashMap.containsKey(userId))
         return userHashMap.get(userId);
        else {
            System.out.println("user is not registered");
            return null;
        }
    }
}
