public class Logger {
    private static Logger logger;
    private static AbstractLogger topLevelLogger;
    private static LogListener logListener;

    private Logger(){}

    public static Logger getInstance(){
        if(logger == null){
            logger = new Logger();
            topLevelLogger = initLoggers();
            logListener = new LogListener();
        }
        return  logger;
    }

    private static AbstractLogger initLoggers() {
        DebugLogger debugLogger = new DebugLogger(3);
        InfoLogger infoLogger = new InfoLogger(2);
        ErrorLogger errorLogger = new ErrorLogger(1);

        debugLogger.setNextLevel(infoLogger);
        infoLogger.setNextLevel(errorLogger);

        return debugLogger;
    }


    public void debug(String msg){
        topLevelLogger.logMessage(3, msg, logListener);
    }

    public void error(String msg){
        topLevelLogger.logMessage(1, msg, logListener);
    }

    public void info(String msg){
        topLevelLogger.logMessage(2, msg, logListener);
    }

    public LogListener getLogListener() {
        return logListener;
    }

}
