package service;

public interface SessionServiceInterface {
    void addSession(String userId);
    boolean getSession(String userId);
    void removeSession(String userId);
}
