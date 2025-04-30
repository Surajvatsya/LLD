package service;

import model.User;

public interface GenericUserService {
    void register(User user);
    void login(String contact);
    void logout(String contact);

}
