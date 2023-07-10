public class ErrorLogger extends AbstractLogger {

    public ErrorLogger(int level) {
        this.level = level;
    }
    @Override
    public void logMsg(int level, String msg,  LogListener logListener) {
        msg = "ERROR: " + msg;
        logListener.notifyListener(1, msg);
    }
}
