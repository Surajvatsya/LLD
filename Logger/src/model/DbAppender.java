package model;

import java.time.LocalDateTime;

public class DbAppender implements Appender{

    private String dbConnection;

    public DbAppender(String dbConnection) {
        this.dbConnection = dbConnection;
    }

    @Override
    public void append(String message, LogLevel logLevel, LocalDateTime localDateTime) {
        System.out.println("Appending in DB" + message);
    }
}
