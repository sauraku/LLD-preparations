import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Logger LOG = Logger.getInstance();
        Map<Integer, List<LogSubscriber>> subscribers = new HashMap<>();
        subscribers.put(3, Arrays.asList(new ConsoleLogSubscriber(), new FileLogSubscriber()));
        subscribers.put(2, Arrays.asList(new ConsoleLogSubscriber()));
        subscribers.put(1, Arrays.asList(new ConsoleLogSubscriber()));

        LOG.getLogListener().setSubscribers(subscribers);

        LOG.debug("this is debug");
    }
}