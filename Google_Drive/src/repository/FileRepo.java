package repository;

import model.File;

public interface FileRepo {
    void addFile(File file);
    void deleteFile(String fileId);
    File getFileById(String fileid);
}
