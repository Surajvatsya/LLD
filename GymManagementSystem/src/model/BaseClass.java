package model;

import java.time.LocalDateTime;

public class BaseClass {
    private String id;
    private LocalDateTime createdAt;
    private  LocalDateTime updatedAt;

    public BaseClass(String id, LocalDateTime createdAt, LocalDateTime updatedAt) {
        this.id = id;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public String getId() {
        return id;
    }
}
