package model;

import java.time.LocalDateTime;
import java.util.List;

public class File extends Base{
    private String driveId;
    private String folderId;

    private String fileName;
    private List<Version> versionList;
    private User owner;
    private List<AccessControl> accessControls;

    public File(String id, LocalDateTime dateTime, LocalDateTime modifiedTime, String driveId, String folderId, List<Version> versionList, String fileName, List<AccessControl> accessControls, User owner) {
        super(id, dateTime, modifiedTime);
        this.driveId = driveId;
        this.folderId = folderId;
        this.versionList = versionList;
        this.fileName = fileName;
        this.accessControls = accessControls;
        this.owner = owner;
    }

    public String getFileName() {
        return fileName;
    }

    public String getDriveId() {
        return driveId;
    }

    public String getFolderId() {
        return folderId;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public List<Version> getVersionList() {
        return versionList;
    }

    public void setVersionList(List<Version> versionList) {
        this.versionList = versionList;
    }

    public User getOwner() {
        return owner;
    }

    public void setOwner(User owner) {
        this.owner = owner;
    }

    public List<AccessControl> getAccessControls() {
        return accessControls;
    }

    public void setAccessControls(List<AccessControl> accessControls) {
        this.accessControls = accessControls;
    }
}
