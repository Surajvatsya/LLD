package repository;

import model.Drive;
import model.Folder;

import java.util.List;

public interface DriveRepoInterface {
    void createDrive(Drive drive);
    void createFolder(Folder folder);
    void removeFolder(String id);
    List<Folder> getAllFolder();
    Folder getFolderById(String id);
}
