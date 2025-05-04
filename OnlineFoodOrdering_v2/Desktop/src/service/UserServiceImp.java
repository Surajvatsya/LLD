package service;

import model.User;
import repository.UserRepo;

public class UserServiceImp implements UserService{

    private UserRepo userRepo;

    public UserServiceImp(UserRepo userRepo) {
        this.userRepo = userRepo;
    }

    @Override
    public void register(User user) throws IllegalArgumentException {
        if(user== null || user.getId()==null)
            throw new IllegalArgumentException("Issue in user");

        try{
            userRepo.register(user);
        } catch (IllegalArgumentException e) {
            throw new RuntimeException(e);
        }

    }

    @Override
    public User getUserById(String id) throws IllegalArgumentException {
        if(id==null)
            throw new IllegalArgumentException("Id is null");

        try{
            return userRepo.getUserById(id);
        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException("User not found");
        }
    }
}
