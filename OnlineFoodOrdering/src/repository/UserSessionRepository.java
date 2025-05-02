package repository;

/**
 * Interface defining data access operations for simple user sessions.
 * Note: This represents a very basic session mechanism. Consider evolving
 * to use secure tokens, expiry times, and potentially a Session object.
 */
public interface UserSessionRepository { // Renamed from GenericUserSession

    /**
     * Creates or marks a session as active for the given user ID.
     * @param userId The ID of the user to create a session for. Must not be null.
     * @throws IllegalArgumentException if userId is null.
     */
    void createSession(String userId);

    /**
     * Checks if an active session exists for the given user ID.
     * @param userId The ID of the user to check. Must not be null.
     * @return true if an active session exists, false otherwise.
     * @throws IllegalArgumentException if userId is null.
     */
    boolean isSessionActive(String userId); // Renamed from getSession

    /**
     * Removes or marks the session as inactive for the given user ID.
     * Does nothing if no active session exists for the user.
     * @param userId The ID of the user whose session should be removed. Must not be null.
     * @throws IllegalArgumentException if userId is null.
     */
    void removeSession(String userId);
}
