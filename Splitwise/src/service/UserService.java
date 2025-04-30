package service;

import model.User;
import repository.UserRepoInterface;

public class UserService implements UserServiceInterface{

    private UserRepoInterface userRepoInterface;

    public UserService(UserRepoInterface userRepoInterface) {
        this.userRepoInterface = userRepoInterface;
    }

    @Override
    public void register(User user) {
        userRepoInterface.register(user);
    }

    @Override
    public User getUser(String userId) {
        return userRepoInterface.getUser(userId);
    }
}
