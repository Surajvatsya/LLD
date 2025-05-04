package service;

import model.User;
import repository.UserRepo;

public class UserServiceImp implements UserService{

    private UserRepo userRepo;

    public UserServiceImp(UserRepo userRepo) {
        this.userRepo = userRepo;
    }

    @Override
    // Removed throws declaration
    public void register(User user) {
        // Removed redundant null check (assuming controller handles basic nulls)
        // if(user== null || user.getId()==null)
        //     throw new IllegalArgumentException("Issue in user");

        // Removed try-catch that wrapped repo exception in RuntimeException.
        // Let repo exceptions (like potential UserAlreadyExistsException) propagate.
        userRepo.register(user);
    }

    @Override
    // Removed throws declaration
    public User getUserById(String id) {
        // Removed redundant null check (assuming controller handles basic nulls)
        // if(id==null)
        //     throw new IllegalArgumentException("Id is null");

        // Removed try-catch. Let repo handle "not found" appropriately
        // (e.g., return null, Optional, or throw UserNotFoundException).
        // The service might then map this (e.g., throw if repo returns null).
        // For now, just call the repo method directly.
        User user = userRepo.getUserById(id);
        // TODO: Add handling here if repo returns null (e.g., throw UserNotFoundException)
        // if (user == null) {
        //    throw new UserNotFoundException("User not found with id: " + id); // Assuming UserNotFoundException exists
        // }
        return user; // This might return null if repo returns null
    }
}
