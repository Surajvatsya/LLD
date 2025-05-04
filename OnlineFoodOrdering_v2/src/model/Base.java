package model;

import java.time.LocalDateTime;
import java.util.Objects;

public class Base {
    // Made fields final for immutability
    private final String id;
    private final LocalDateTime createdAt;

    public Base(String id, LocalDateTime createdAt) {
        // Added null checks for constructor arguments
        this.id = Objects.requireNonNull(id, "ID cannot be null");
        this.createdAt = Objects.requireNonNull(createdAt, "Creation timestamp cannot be null");
    }

    public String getId() {
        return id;
    }

    // Added getter for createdAt
    public LocalDateTime getCreatedAt() {
        return createdAt;
    }
}
