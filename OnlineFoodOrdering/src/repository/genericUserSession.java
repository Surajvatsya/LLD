package repository;

public interface genericUserSession {
    void createSession(String userId);
    boolean getSession(String userId);
    void removeSession(String userId);
}
