import model.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        // create LOG_MANAGER config
        LogManager logManager = LogManager.getLogManagerInstance();

        //update logLevel
        logManager.setLogLevel(LogLevel.INFO);

        //add appenders
        Appender appender1 = new ConsoleAppender();
        Appender appender2 = new FileAppender("myFile");

        logManager.addAppender(appender1);
        logManager.addAppender(appender2);

        // create Logger class instance
        Logger logger = new Logger(logManager);

        logger.log(LogLevel.DEBUG,"Got an error Sir jee");

    }
}