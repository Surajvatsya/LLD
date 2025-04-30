package model;

import java.time.LocalDateTime;

public class Base {
    private String  id;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    public Base(String id) {
        this.id = id;
        this.createdAt = LocalDateTime.now();
        this.updatedAt = LocalDateTime.now();;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
