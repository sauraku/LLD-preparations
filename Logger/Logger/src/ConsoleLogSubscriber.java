public class ConsoleLogSubscriber implements LogSubscriber {
    @Override
    public void log(String msg) {
        System.out.println("CONSOLE: " + msg);
    }
}
