package repository;

import model.File;
import model.Folder;

import java.util.HashMap;

public class FileRepoImp implements FileRepo{

    private HashMap<String, File> fileHashMap = new HashMap<>();
    private FolderRepo folderRepo;

    public FileRepoImp(FolderRepo folderRepo) {
        this.folderRepo = folderRepo;
    }

    @Override
    public void addFile(File file) {

        // 1. Save globally into FolderRepo
        folderRepo.addFile(file);

        // 2. Link to Folder
        String folderId = file.getFolderId();
        Folder folder = folderRepo.getFolder(folderId);
        folder.addFiles(file);

        // 3. Add in FileRepo for direct fast access
        fileHashMap.put(file.getId(), file);
    }

    @Override
    public void deleteFile(String fileId) {

        //same here
        fileHashMap.remove(fileId);
    }

    @Override
    public File getFileById(String fileid) {
       return fileHashMap.get(fileid);
    }
}
