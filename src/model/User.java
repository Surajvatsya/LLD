package model;

public abstract class User {
    private int id;
    private String userName;
    private String contact;

    public User(int id, String userName, String contact) {
        this.id = id;
        this.userName = userName;
        this.contact = contact;
    }

    public String getContact() {
        return contact;
    }

    public String getUserName() {
        return userName;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }
}

