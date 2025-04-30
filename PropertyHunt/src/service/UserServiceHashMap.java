package service;

import model.User;
import repository.UserRepository;
import repository.UserRepositoryHashMap;
import repository.UserSessionManager;
//import rep

public class UserServiceHashMap implements GenericUserService {

    //dependency injection -> learn

    UserRepository userRepository;
    UserSessionManager userSessionManager;

    public UserServiceHashMap(UserRepository userRepository, UserSessionManager userSessionManager) {
        this.userRepository = userRepository;
        this.userSessionManager = userSessionManager;
    }

    @Override
    public void register(User user) {
        if(userRepository.getUser(user.getContact())==null)
            userRepository.saveUser(user);
        else
            System.out.println("You are already registered :) ");
    }

    @Override
    public void login(String contact) {
        if(userSessionManager.isLoggedIn(contact))
            System.out.println("You are already LoggedIn");
        else
            userSessionManager.createUserSession(contact);
    }

    @Override
    public void logout(String contact) {
        if(userSessionManager.isLoggedIn(contact))
            userSessionManager.removeUserSession(contact);
        else if(userRepository.getUser(contact)==null)
            System.out.println("User not registered");
        else
            System.out.println("User is not loggedIn");

    }
}
