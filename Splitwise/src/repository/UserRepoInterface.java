package repository;

import model.User;

public interface UserRepoInterface {
    void register(User user);
    User getUser(String userId);
}
