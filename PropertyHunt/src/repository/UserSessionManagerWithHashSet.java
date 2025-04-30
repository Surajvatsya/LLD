package repository;

import java.util.HashSet;
import java.util.Set;

public class UserSessionManagerWithHashSet implements UserSessionManager{
    private Set<String> userSession = new HashSet<>();

    @Override
    public void createUserSession(String contact) {
        userSession.add(contact);
    }

    @Override
    public Boolean isLoggedIn(String contact) {
        return userSession.contains(contact);
    }

    @Override
    public void removeUserSession(String contact) {
        userSession.remove(contact);
    }
}
