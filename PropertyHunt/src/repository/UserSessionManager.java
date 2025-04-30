package repository;

//strategy pattern
public interface UserSessionManager {
   void createUserSession(String contact);
    Boolean isLoggedIn(String contact);
    void removeUserSession(String contact);
}
