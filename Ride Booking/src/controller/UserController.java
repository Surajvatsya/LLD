package controller;

import model.User;
import service.UserServiceInterface;

public class UserController {
    private UserServiceInterface userServiceInterface;

    public UserController(UserServiceInterface userServiceInterface) {
        this.userServiceInterface = userServiceInterface;
    }


    public void createUser(User user){
        userServiceInterface.register(user);
    }

    public  void getuser(String id){
        userServiceInterface.getUser(id);
    }

}
