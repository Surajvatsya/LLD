package model;

import java.time.LocalDateTime;

public interface Appender {
    void append(String message, LogLevel logLevel, LocalDateTime localDateTime);
}
