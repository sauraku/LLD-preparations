public class DebugLogger extends AbstractLogger{
    public DebugLogger(int level) {
        this.level = level;
    }

    @Override
    public void logMsg(int level, String msg,  LogListener logListener) {
        msg = "DEBUG: " + msg;
        logListener.notifyListener(3, msg);
    }
}
