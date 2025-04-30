package service;

import model.User;
import repository.GenericUser;
import repository.UserSessionRepo;
import repository.genericUserSession;

public class UserService implements GenericUserService {

    //dependency injection
   GenericUser genericUserRepo;
    genericUserSession userSessionRepo;

    public UserService(GenericUser genericUserRepo, genericUserSession userSessionRepo) {
        this.genericUserRepo = genericUserRepo;
        this.userSessionRepo = userSessionRepo;
    }

    @Override
    public void register(User user) {
        genericUserRepo.register(user);
    }

    @Override
    public void login(String userid) {
        userSessionRepo.createSession(userid);
    }

    @Override
    public void logout(String userId) {
        userSessionRepo.removeSession(userId);
    }

}
