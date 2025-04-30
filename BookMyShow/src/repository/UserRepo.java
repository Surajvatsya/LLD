package repository;

import model.User;

import java.util.HashMap;

public class UserRepo implements UserRepoInterface{

    private HashMap<String, User> userHashMap = new HashMap<>();

    @Override
    public void register(User user) {
        userHashMap.put(user.getId(),user);
    }

    @Override
    public User getUserById(String id) {
       return  userHashMap.get(id);
    }
}
