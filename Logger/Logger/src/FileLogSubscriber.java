public class FileLogSubscriber implements LogSubscriber {
    @Override
    public void log(String msg) {
        System.out.println("FILE: " + msg);
    }
}
