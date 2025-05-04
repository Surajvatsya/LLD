package service;

import model.User;

public interface UserService {
    void register(User user) throws IllegalArgumentException;
    User getUserById(String id) throws IllegalArgumentException;
}
