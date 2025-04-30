package model;

import java.time.LocalDateTime;

public class Logger {

    //got config of logmanaer
    private LogManager logManager = null;

    public Logger(LogManager logManager) {
        this.logManager = LogManager.getLogManagerInstance();
    }


    //central log method

    public void log(LogLevel logLevel, String message){
        if(logLevel.getLogLevel()>=logManager.getLogLevel().getLogLevel()){
            for(Appender appender : LogManager.getLogManagerInstance().getAppender()){
                appender.append(message,logLevel, LocalDateTime.now());
            }
        }
    }



}
