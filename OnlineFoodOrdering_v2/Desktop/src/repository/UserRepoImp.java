package repository;

import model.User;

import java.util.concurrent.ConcurrentHashMap;

public class UserRepoImp implements UserRepo{

    private final ConcurrentHashMap<String, User> userMap ;

    public UserRepoImp() {
        userMap = new ConcurrentHashMap<>();
    }

    @Override
    public void register(User user) throws IllegalArgumentException {
        if(user==null || user.getId()==null){
            throw  new IllegalArgumentException("Invalid user data"); // rem throw new ...
        }
        userMap.put(user.getId(),user);
    }

    @Override
    public User getUserById(String userId) throws IllegalArgumentException {
//        if(userId==null)
//            throw new IllegalArgumentException("Invalid UserId");
        User user = userMap.get(userId);
        if(user==null)
            throw new IllegalArgumentException("Invalid UserId");
        return user;

    }
}
