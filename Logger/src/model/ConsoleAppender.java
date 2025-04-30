package model;

import java.time.LocalDateTime;

public class ConsoleAppender implements Appender{
    @Override
    public void append(String message, LogLevel logLevel, LocalDateTime localDateTime) {
        System.out.println(" Printing on console " + message);
    }

//    public ConsoleAppender() {
//    }
}
