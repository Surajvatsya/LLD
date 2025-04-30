package model;

import java.time.LocalDateTime;
import java.util.List;

public class Drive extends Base{
    private List<File>files;
    private final List<Folder>folders;
    private int capacity;

//    public Drive(String id, LocalDateTime dateTime, List<File> files, List<Folder> folders, int capacity) {
//        super(id, dateTime);
//        this.files = files;
//        this.folders = folders;
//        this.capacity = capacity;
//    }


    public Drive(String id, LocalDateTime dateTime, LocalDateTime modifiedTime, List<File> files, List<Folder> folders, int capacity) {
        super(id, dateTime, modifiedTime);
        this.files = files;
        this.folders = folders;
        this.capacity = capacity;
    }

    public List<File> getFiles() {
        return files;
    }

    public void setFiles(List<File> files) {
        this.files = files;
    }

    public List<Folder> getFolders() {
        return folders;
    }

    public void addFolders(Folder folder) {
        this.folders.add(folder);
    }

    public void removeFolder(Folder folder) {
        this.folders.remove(folder);
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
}
