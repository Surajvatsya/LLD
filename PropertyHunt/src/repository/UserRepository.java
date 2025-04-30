package repository;

import model.User;

//startegy pattern

public interface UserRepository {
    void saveUser(User user);
    User getUser (String contact);

    }
