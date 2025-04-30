package model;

import java.time.LocalDateTime;

public class Version extends Base{

    private String content;
    private User modifiedBy;

    public Version(String id, LocalDateTime dateTime, LocalDateTime modifiedTime, String content, User modifiedBy) {
        super(id, dateTime, modifiedTime);
        this.content = content;
        this.modifiedBy = modifiedBy;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public User getModifiedBy() {
        return modifiedBy;
    }

    public void setModifiedBy(User modifiedBy) {
        this.modifiedBy = modifiedBy;
    }
}
