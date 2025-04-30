package service;

import model.User;
import repository.UserRepoInterface;

public class UserService implements UserServiceInterface{

    UserRepoInterface userRepoInterface ;

    public UserService(UserRepoInterface userRepoInterface) {
        this.userRepoInterface = userRepoInterface;
    }

    @Override
    public void register(User user) {
        userRepoInterface.register(user);
    }

    @Override
    public void getUser(String userId) {
        User user = userRepoInterface.getUser(userId);
        System.out.println(user);
    }
}
