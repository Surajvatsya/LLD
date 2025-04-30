package repository;

import java.util.HashSet;

public class UserSessionRepo implements genericUserSession{
    private HashSet<String> sessionHashset= new HashSet<>();
    @Override
    public void createSession(String userId) {
        sessionHashset.add(userId);
    }

    @Override
    public boolean getSession(String userId) {
        return sessionHashset.contains(userId);

    }

    @Override
    public void removeSession(String userId) {
        sessionHashset.remove(userId);
    }
}
