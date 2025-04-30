package repository;

import model.User;

public interface GenericUser {
    void register(User user);

    User getUserById(String userId);
}
