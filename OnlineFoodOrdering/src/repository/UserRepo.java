package repository;

import model.User;

import java.util.HashMap;

public class UserRepo implements GenericUser{
    private HashMap<String, User> userHashMap ;
    @Override
    public void register(User user) {
        userHashMap.put(user.getId(), user);
    }

    public UserRepo() {
        this.userHashMap = new HashMap<>();
    }

    @Override
    public User getUserById(String userId) {
        if(userHashMap.containsKey(userId))
            return  userHashMap.get(userId);
        System.out.println("No User Found");
        return null;
    }
}
