package repository;

import model.User;

import java.util.List;

public interface GenericUserRepository {
    //CRUD
    void registerUser(User user);
    List<User> getAllUsers();
    User getUserById(String userId);
}
