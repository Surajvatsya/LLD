package repository;

public interface UserSessionRepoInterface {
    void addSession(String userId);
    boolean getSession(String userId);
    void removeSession(String userId);
}
