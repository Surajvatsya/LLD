package model;

import java.time.LocalDateTime;

public class Base {
    private String id;
    private LocalDateTime createAt;
    private LocalDateTime updatedAt;

    public Base(String id) {
        this.id = id;
        this.updatedAt = LocalDateTime.now();
        this.createAt = LocalDateTime.now();
    }



    public void setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    public String getId() {
        return id;
    }
}
