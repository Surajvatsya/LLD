package model;

import java.util.ArrayList;
import java.util.List;


//global config

public class LogManager {

    //logLevel
    //Log
    //Appender


    private LogLevel logLevel;
    private Logger log;
    private List<Appender> appender;

    private static LogManager instance = null;


    public List<Appender> getAppender() {
        return appender;
    }

    ///    private LogManager() {
    //      this.instance = instance;
    //    }


//  create a default constructor only in singleton
    private LogManager() {
        logLevel=LogLevel.DEBUG;
        appender = new ArrayList<>();
    }

    public void setLogLevel(LogLevel logLevel) {
        this.logLevel = logLevel;
    }

    public void setLog(Logger log) {
        this.log = log;
    }

    public void addAppender(Appender appender){
        this.appender.add(appender);
    }

    public void removeAppender(Appender appender){
        this.appender.remove(appender);
    }

    public LogLevel getLogLevel() {
        return logLevel;
    }

    public static LogManager getLogManagerInstance (){
        if(instance == null){
            instance =  new LogManager();
        }
        return instance;
    }
}
