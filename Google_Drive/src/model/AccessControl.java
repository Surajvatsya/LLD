package model;

import java.time.LocalDateTime;
import java.util.List;

public class AccessControl extends Base{
    private User user;
    private List<Access> accessList;

    public AccessControl(String id, LocalDateTime dateTime, LocalDateTime modifiedTime, User user, List<Access> accessList) {
        super(id, dateTime, modifiedTime);
        this.user = user;
        this.accessList = accessList;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public List<Access> getAccessList() {
        return accessList;
    }

    public void setAccessList(List<Access> accessList) {
        this.accessList = accessList;
    }
}
