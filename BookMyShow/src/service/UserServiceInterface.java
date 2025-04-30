package service;

import model.User;

public interface UserServiceInterface {
    void register(User user);
    User getUser(String id);
}
