package repository;

import java.util.Collections; // Potentially needed for synchronizedSet
// Removed unused import java.util.Collections;
// Removed unused import java.util.HashSet;
import java.util.Set;
// Using ConcurrentHashMap for thread safety
import java.util.concurrent.ConcurrentHashMap;

// Updated to implement UserSessionRepository
public class UserSessionRepo implements UserSessionRepository {
    // Switched to ConcurrentHashMap.newKeySet() for thread safety
    private final Set<String> sessionSet = ConcurrentHashMap.newKeySet(); // Renamed variable

    @Override
    public void createSession(String userId) {
        if (userId == null) {
             throw new IllegalArgumentException("User ID cannot be null.");
        }
        sessionSet.add(userId); // Use renamed variable
    }

    // Renamed method to match interface
    @Override
    public boolean isSessionActive(String userId) {
         if (userId == null) {
             return false; // Return false for null input instead of throwing exception
         }
        return sessionSet.contains(userId); // Use renamed variable
    }

    @Override
    public void removeSession(String userId) {
         if (userId == null) { // Added null check for consistency
             throw new IllegalArgumentException("User ID cannot be null.");
         }
         // remove() on ConcurrentHashMap.newKeySet() is thread-safe
         sessionSet.remove(userId); // Use renamed variable
    }
}
