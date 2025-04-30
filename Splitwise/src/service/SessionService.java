package service;

import repository.UserSessionRepoInterface;

public class SessionService implements SessionServiceInterface{

    private UserSessionRepoInterface userSessionRepoInterface;

    public SessionService(UserSessionRepoInterface userSessionRepoInterface) {
        this.userSessionRepoInterface = userSessionRepoInterface;
    }

    @Override
    public void addSession(String userId) {
        userSessionRepoInterface.addSession(userId);
    }

    @Override
    public boolean getSession(String userId) {
        return userSessionRepoInterface.getSession(userId);
    }

    @Override
    public void removeSession(String userId) {
        userSessionRepoInterface.removeSession(userId);
    }
}
