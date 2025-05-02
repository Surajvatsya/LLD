package service;

import model.User;

public interface GenericUserService {
    void register(User user);
    // Login now declares it can throw exceptions on failure
    void login(String userId) throws Exception; // Placeholder for specific exceptions
    // Logout now returns boolean to indicate success/failure
    boolean logout(String userId);
}
