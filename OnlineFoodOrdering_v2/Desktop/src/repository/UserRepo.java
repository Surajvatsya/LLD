package repository;

import model.User;

public interface UserRepo {
    void register(User user) throws IllegalArgumentException ;
    User getUserById(String userId) throws IllegalArgumentException;
}
