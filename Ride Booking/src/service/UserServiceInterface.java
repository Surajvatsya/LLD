package service;

import model.User;

public interface UserServiceInterface {
    void register(User user);
    void getUser(String userId);
}
