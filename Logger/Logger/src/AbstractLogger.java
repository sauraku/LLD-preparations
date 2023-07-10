public abstract class AbstractLogger {
    int level;
    AbstractLogger nextLevel;

    public abstract void logMsg(int level, String msg, LogListener logListener);

    public void logMessage(int level,String msg,  LogListener logListener){
        if(this.level <= level){
            logMsg(level, msg, logListener);
        } else {
            nextLevel.logMessage(level, msg, logListener);
        }
    }

    public void setNextLevel(AbstractLogger nextLevel){
        this.nextLevel = nextLevel;
    }

}
