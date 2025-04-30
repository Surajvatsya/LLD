package repository;

import java.util.HashSet;
import java.util.Set;

public class UserSessionRepo implements UserSessionRepoInterface{

    private Set<String> session = new HashSet<>();
    @Override
    public void addSession(String userId) {
        session.add(userId);
    }

    @Override
    public boolean getSession(String userId) {
        return session.contains(userId);
    }

    @Override
    public void removeSession(String userId) {
        session.remove(userId);
    }
}
