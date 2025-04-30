package model;

import java.time.LocalDateTime;

public class FileAppender implements Appender{

    private String filePath;

    public FileAppender(String filePath) {
        this.filePath = filePath;
    }

    @Override
    public void append(String message, LogLevel logLevel, LocalDateTime localDateTime) {
        System.out.println("Appending " + message + " to filePath " + filePath);
    }
}
