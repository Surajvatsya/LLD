package model;

import java.time.LocalDateTime;

public abstract class Base {
    private String id;
    private LocalDateTime dateTime;
    private LocalDateTime modifiedTime;

//    public Base(String id, LocalDateTime dateTime) {
//        this.id = id;
//        this.dateTime = dateTime;
//    }


    public Base(String id, LocalDateTime dateTime, LocalDateTime modifiedTime) {
        this.id = id;
        this.dateTime = dateTime;
        this.modifiedTime = modifiedTime;
    }

    public String getId() {
        return id;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }
}
