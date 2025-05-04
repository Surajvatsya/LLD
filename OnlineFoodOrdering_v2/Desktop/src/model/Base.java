package model;

import java.time.LocalDateTime;

public class Base {
    private String id;
    private LocalDateTime createdAt;

    public Base(String id, LocalDateTime createdAt) {
        this.id = id;
        this.createdAt = createdAt;
    }

    public String getId() {
        return id;
    }

}
