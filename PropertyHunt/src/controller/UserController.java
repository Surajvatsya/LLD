package controller;


import model.User;
import service.GenericUserService;

//LEARN DTO
//2 class should not be dependent -> DIP

public class UserController {
    private GenericUserService genericUserService;

    public UserController(GenericUserService genericUserService) {
        this.genericUserService = genericUserService;
    }

    public void register (User user){
        genericUserService.register(user);
        System.out.println("Registered User Successfully");

    }
    public void login (String contact ){
        genericUserService.login(contact);
    }

    public void logout (String contact){
        genericUserService.logout(contact);
    }
}
