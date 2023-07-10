public class InfoLogger extends AbstractLogger {

    public InfoLogger(int level) {
        this.level = level;
    }
    @Override
    public void logMsg(int level, String msg,  LogListener logListener) {
        msg = "INFO: " + msg;
        logListener.notifyListener(2, msg);
    }
}
