package model;

import java.time.LocalDateTime;

public abstract class IdAndTime {
    private long id;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    public IdAndTime(long id, LocalDateTime createdAt, LocalDateTime updatedAt) {
        this.id = id;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public long getId() {
        return id;
    }
}
