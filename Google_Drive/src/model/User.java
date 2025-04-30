package model;

import java.time.LocalDateTime;

public class User extends Base {

    private String name;
    private String email;
    private Drive drive;


//    public User(String id, LocalDateTime dateTime, String name, String email, Drive drive) {
//        super(id, dateTime);
//        this.name = name;
//        this.email = email;
//        this.drive = drive;
//    }


    public User(String id, LocalDateTime dateTime, LocalDateTime modifiedTime, String name, String email, Drive drive) {
        super(id, dateTime, modifiedTime);
        this.name = name;
        this.email = email;
        this.drive = drive;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Drive getDrive() {
        return drive;
    }

    public void setDrive(Drive drive) {
        this.drive = drive;
    }
}
