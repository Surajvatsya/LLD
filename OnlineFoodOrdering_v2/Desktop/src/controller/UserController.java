package controller;

import model.User;
import service.UserService;

public class UserController {
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    void register(User user){
        if(user == null || user.getId()==null){
            throw  new IllegalArgumentException("Invalid user");
        }
        try{
            userService.register(user);
        }
        catch(IllegalArgumentException e){
            throw new IllegalArgumentException(e);
        }
    }

    User getUserById(String id){
        if(id == null)
        {
            throw new IllegalArgumentException("Invalid user");
        }
        try{
            return userService.getUserById(id);
        }
        catch(IllegalArgumentException e){
            throw new IllegalArgumentException(e);
        }
    }
}
