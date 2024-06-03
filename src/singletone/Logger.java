package singletone;

import java.time.LocalDate;

public class Logger {
    private static Logger logger;
    private static String logFile = "This is log file. \n\n";

    public static synchronized Logger getLogger() {
        if (logger == null) {
            logger = new Logger();
        }
        return logger;
    }

    private Logger() {}

    public void classLog(Object obj, String info) {
        String className = obj.getClass().getSimpleName();
        String logMessage = String.format("Log info: %s - %s - %s", LocalDate.now(), className, info);
        logFile += logMessage + "\n";
    }

    public void showLogFile() {
        System.out.println(logFile);
    }
}