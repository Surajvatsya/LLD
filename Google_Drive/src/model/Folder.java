package model;

import java.time.LocalDateTime;
import java.util.List;

public class Folder extends Base{
    private String driveId;
    private String folderName;
    private List<File>files;
    private User owner;


    public Folder(String id, LocalDateTime dateTime, LocalDateTime modifiedTime, String driveId, String folderName, User owner, List<File> files) {
        super(id, dateTime, modifiedTime);
        this.driveId = driveId;
        this.folderName = folderName;
        this.owner = owner;
        this.files = files;
    }

    public String getFolderName() {
        return folderName;
    }

    public void setFolderName(String folderName) {
        this.folderName = folderName;
    }

    public List<File> getFiles() {
        return files;
    }

    public void addFiles(File file) {
        this.files.add(file);
    }

    public User getOwner() {
        return owner;
    }

    public void setOwner(User owner) {
        this.owner = owner;
    }

    public String getDriveId() {
        return driveId;
    }
//    public Folder(String id, LocalDateTime dateTime, LocalDateTime modifiedTime) {
//        super(id, dateTime, modifiedTime);
//    }
}
