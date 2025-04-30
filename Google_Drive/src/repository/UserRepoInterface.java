package repository;

import model.User;

public interface UserRepoInterface {
    void registerUser(User user);
    User getUserById(String userId);
}
