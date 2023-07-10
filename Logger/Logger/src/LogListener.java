import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class LogListener {

    Map<Integer, List<LogSubscriber>> subscribers;

    public void subscribeLogObserver(int level, LogSubscriber logSubscriber){
        if(subscribers.get(level)==null){
            subscribers.put(level, new ArrayList<>());
        }
        subscribers.get(level).add(logSubscriber);
    }

    public void notifyListener(int level, String msg){
        for(LogSubscriber logSubscriber : subscribers.get(level)){
            logSubscriber.log(msg);
        }
    }

    public Map<Integer, List<LogSubscriber>> getSubscribers() {
        return subscribers;
    }

    public void setSubscribers(Map<Integer, List<LogSubscriber>> subscribers) {
        this.subscribers = subscribers;
    }
}
