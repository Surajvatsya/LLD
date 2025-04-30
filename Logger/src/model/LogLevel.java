package model;

public enum LogLevel {
    DEBUG(1),INFO(2),ERROR(3),FATAL(4);


    private final int logLevel;

    LogLevel(int level) {
        logLevel = level;
    }

    public int getLogLevel() {
        return logLevel;
    }
}
