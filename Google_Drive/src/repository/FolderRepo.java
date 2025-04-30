package repository;

import model.File;
import model.Folder;

import java.util.List;

public interface FolderRepo {
    void addFolder(Folder folder);
    void addFile(File file);
    void removeFile(String fileId);
    void deleteFolder(String folderId);
    Folder getFolder(String folderId);
    List<Folder> getFolders();
}
