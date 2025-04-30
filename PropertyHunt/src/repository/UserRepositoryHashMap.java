package repository;

import model.User;

import java.util.HashMap;
import java.util.Map;


//here we are treating HashMap as Persistent data storage

public class UserRepositoryHashMap implements UserRepository{

    private final Map<String,User> userMap = new HashMap<>();


    @Override
    public void saveUser(User user) {

        userMap.put(user.getContact(),user);

    }

    @Override
    public User getUser(String contact) {
        return userMap.get(contact);
    }
}
