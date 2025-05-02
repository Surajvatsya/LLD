package model;

import java.time.LocalDateTime;

public class Base {
    private final String  id;
    private final LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    public Base(String id) {
        this.id = id;
        this.createdAt = LocalDateTime.now();
        this.updatedAt = LocalDateTime.now();
    }

    public String getId() {
        return id;
    }

    public void setUpdatedAt(LocalDateTime updatedAt){
        this.updatedAt = updatedAt;
    }

    // Getter for createdAt (Recommended)
    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    // Getter for updatedAt (Recommended)
    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }
}
