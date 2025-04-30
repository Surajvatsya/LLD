package service;

import model.User;

public interface GenericUserService {
    void register(User user);
    void login(String userid);
    void logout(String userId);
}
