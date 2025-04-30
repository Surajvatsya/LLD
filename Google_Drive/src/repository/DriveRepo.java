package repository;

import model.Drive;
import model.Folder;

import java.util.HashMap;
import java.util.List;
import repository.FolderRepo;

public class DriveRepo implements DriveRepoInterface{

    private FolderRepo folderRepo;

    public DriveRepo(FolderRepo folderRepo) {
        this.folderRepo = folderRepo;
    }

    private HashMap<String,Drive> driveHashMap = new HashMap<>();
    @Override
    public void createDrive(Drive drive) {
        if(driveHashMap.containsKey(drive.getId()))
        {
            System.out.println("Drive already present");
            return;
        }
        driveHashMap.put(drive.getId(), drive);
    }

    @Override
    public void createFolder(Folder folder) {
        // Save folder in FolderRepo first
        folderRepo.addFolder(folder);

        // Then link folder to Drive
        String driveId = folder.getDriveId();
        Drive drive = driveHashMap.get(driveId);
        drive.addFolders(folder);

    }

    @Override
    public void removeFolder(String id) {
        Folder folder = folderRepo.getFolder(id);

        folderRepo.deleteFolder(id);

        //unlink
        String driveId = folder.getDriveId();
        Drive drive = driveHashMap.get(driveId);
        drive.removeFolder(folder);
    }

    @Override
    public List<Folder> getAllFolder() {
        return folderRepo.getFolders();
    }

    @Override
    public Folder getFolderById(String id) {
        return folderRepo.getFolder(id);
    }
}
