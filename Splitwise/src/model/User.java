package model;

public class User {
    private String id;
    private String name;
    private String email;
    private String mob;

    public User(String id, String name, String email, String mob) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.mob = mob;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    public String getMob() {
        return mob;
    }

    public void setMob(String mob) {
        this.mob = mob;
    }
}
