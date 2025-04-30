package repository;

import model.Folder;

import java.util.HashMap;

public class FolderRepoImp implements FolderRepo{
    private HashMap<String, Folder> folderHashMap = new HashMap<>();
    @Override
    public void addFolder(Folder folder) {
        folderHashMap.put(folder.getId(), folder);
    }

    @Override
    public void deleteFolder(String folderId) {
        folderHashMap.remove(folderId);
    }

    @Override
    public Folder getFolder(String folderId) {
        return folderHashMap.get(folderId);
    }
}
