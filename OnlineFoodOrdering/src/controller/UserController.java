package controller;

import model.User;
import service.GenericUserService;

public class UserController {

    GenericUserService userService;

    public UserController(GenericUserService userService) {
        this.userService = userService;
    }

    public void registerUser(User user){
        userService.register(user);
    }
    public void login(String userId){
        userService.login(userId);
    }
    public void logOut(String userId){
        userService.logout(userId);
    }
}
